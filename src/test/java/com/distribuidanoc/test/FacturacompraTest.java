package com.distribuidanoc.test;

import com.distribuidanoc.entities.Facturacompra;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class FacturacompraTest {

    private Facturacompra facturacompra;

    @BeforeEach
    public void setUp(){
        facturacompra = new Facturacompra(1,new Date(),"45.3");
    }

    @Test
    public void testFacturacompraConstructorAndGetter(){
        assertAll("Validar datos facturacompra",
                () -> assertEquals(1,facturacompra.getIdFacturacompra()),
                () -> assertEquals(new Date(),facturacompra.getFecha()),
                () -> assertEquals("45.3",facturacompra.getMontototal())
                );
    }
    @Test
    public void testFacturacompraSetters(){
        facturacompra = new Facturacompra();

        facturacompra.setIdFacturacompra(2);
        facturacompra.setFecha(new Date());
        facturacompra.setMontototal("55.00");

        assertAll("Validar datos facturacompra",
                () -> assertEquals(2,facturacompra.getIdFacturacompra()),
                () -> assertEquals(new Date(),facturacompra.getFecha()),
                () -> assertEquals("55.00",facturacompra.getMontototal())
                );
    }

    @Test
    public void TestToString(){
        String str = facturacompra.toString();
        assertAll("Validar fatos facturacompra",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains((CharSequence) new Date())),
                () -> assertTrue(str.contains("45.3"))
                );
    }
}
