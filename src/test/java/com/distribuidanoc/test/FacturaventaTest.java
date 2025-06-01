package com.distribuidanoc.test;

import com.distribuidanoc.entities.Facturaventa;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FacturaventaTest {
    private Facturaventa facturaventa;

    @BeforeEach
    public void setUp(){
        Facturaventa facturaventa = new Facturaventa(1,new Date(),"120.385");
    }

    @Test
    public void testFacturacompraConstructorAndGetter(){
        assertAll("Validar datos facturacompra",
                () -> assertEquals(1,facturaventa.getIdFacturaventa()),
                () -> assertEquals(new Date(),facturaventa.getFecha()),
                () -> assertEquals("120.385",facturaventa.getMontototal())
        );
    }
    @Test
    public void testFacturacompraSetters(){
        facturaventa = new Facturaventa();

        facturaventa.setIdFacturaventa(2);
        facturaventa.setFecha(new Date());
        facturaventa.setMontototal("40.00");

        assertAll("Validar datos facturacompra",
                () -> assertEquals(2,facturaventa.getIdFacturaventa()),
                () -> assertEquals(new Date(),facturaventa.getFecha()),
                () -> assertEquals("40.00",facturaventa.getMontototal())
        );
    }

    @Test
    public void TestToString(){
        String str = facturaventa.toString();
        assertAll("Validar fatos facturaventa",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains((CharSequence) new Date())),
                () -> assertTrue(str.contains("120.385"))
        );
    }
}
