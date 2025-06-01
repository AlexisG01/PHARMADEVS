package com.distribuidanoc.test;

import com.distribuidanoc.entities.Almacen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class AlmacenTest {

    private Almacen almacen;

    @BeforeEach
    public void setUp(){
        almacen = new Almacen(1,"2000","Pifo");
    }

    @Test
    public void testAlmacenCondtructorAndGetter(){
        assertAll("Validar datos Almacen",
                () -> assertEquals(1,almacen.getIdAlmacen()),
                () -> assertEquals("2000",almacen.getStock()),
                () -> assertEquals("Pifo",almacen.getUbicacion())
                );
    }

    @Test
    public void testAlmacenSetters(){
        almacen = new Almacen();

        almacen.setIdAlmacen(2);
        almacen.setStock("20");
        almacen.setUbicacion("Puembo");

        assertAll("Validar datos Almacen",
                () -> assertEquals(2,almacen.getIdAlmacen()),
                () -> assertEquals("20",almacen.getStock()),
                () -> assertEquals("Puembo",almacen.getUbicacion())
                );
    }

    @Test
    public void TestToString(){
        String str = almacen.toString();
        assertAll("Validar datos de almacen",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("2000")),
                () -> assertTrue(str.contains("Pifo"))
                );
    }
}
