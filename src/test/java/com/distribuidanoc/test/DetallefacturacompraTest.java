package com.distribuidanoc.test;

import com.distribuidanoc.entities.Detallefacturacompra;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DetallefacturacompraTest {

    private Detallefacturacompra detallefacturacompra;

    @BeforeEach
    public void setUp(){
        detallefacturacompra = new Detallefacturacompra(1,"100",0.35F,"15%",42.00F);
    }

    @Test
    public void testDetallefacturacompraConstructorAndGetter(){
        assertAll("Validar datos detalle factura compra",
                () -> assertEquals(1,detallefacturacompra.getIdDetallecompra()),
                () -> assertEquals("100",detallefacturacompra.getCantidad()),
                () -> assertEquals(0.35F,detallefacturacompra.getPreciounitario()),
                () -> assertEquals("15%",detallefacturacompra.getIva()),
                () -> assertEquals(42.00F,detallefacturacompra.getSubtotal())
                );
    }

    @Test
    public void testDetallefacturacompraSetters() {
        detallefacturacompra = new Detallefacturacompra();

        detallefacturacompra.setIdDetallecompra(2);
        detallefacturacompra.setCantidad("200");
        detallefacturacompra.setPreciounitario(0.40F);
        detallefacturacompra.setIva("14%");
        detallefacturacompra.setSubtotal(45.00F);

        assertAll("Validar datos detalle factura compra",
                () -> assertEquals(2,detallefacturacompra.getIdDetallecompra()),
                () -> assertEquals("200",detallefacturacompra.getCantidad()),
                () -> assertEquals(0.40F,detallefacturacompra.getPreciounitario()),
                () -> assertEquals("14%",detallefacturacompra.getIva()),
                () -> assertEquals(45.00F,detallefacturacompra.getSubtotal())
                );
    }

    @Test
    public void TestToString(){
        String str = detallefacturacompra.toString();
        assertAll("Validar datos detalle factura compra",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("100")),
                () -> assertTrue(str.contains("0.35F")),
                () -> assertTrue(str.contains("15%")),
                () -> assertTrue(str.contains("42.00F"))
                );
    }
}
