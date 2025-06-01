package com.distribuidanoc.test;

import com.distribuidanoc.entities.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {

    private Producto producto;

    @BeforeEach
    public void setUp(){
        producto = new Producto(1, "Blinker Plus", "Antiparasitario para gatos, externo gotero", "gotero", "frasco",5.99F);
    }

    @Test
    public void testPruductoConstructorAndGetter(){
        assertAll("Validar datos Producto",
                () -> assertEquals(1,producto.getIdProducto()),
                () -> assertEquals("Blinker Plus",producto.getNombre()),
                () -> assertEquals("Antiparasitario para gatos, externo gotero",producto.getDescripcion()),
                () -> assertEquals("gotero",producto.getCategoria()),
                () -> assertEquals("frasco",producto.getUnidadMedida()),
                () -> assertEquals(5.99F,producto.getPreciobase())
                );
    }

    @Test
    public void testProductoSetters(){
        producto = new Producto();

        producto.setIdProducto(2);
        producto.setNombre("Mascota");
        producto.setDescripcion("Vitaminas");
        producto.setCategoria("Tabletas");
        producto.setUnidadMedida("Unidades");
        producto.setPreciobase(10.50F);

        assertAll("Validar datos Producto",
                () -> assertEquals(2,producto.getIdProducto()),
                () -> assertEquals("Mascota",producto.getNombre()),
                () -> assertEquals("Vitaminas",producto.getDescripcion()),
                () -> assertEquals("Tabletas",producto.getCategoria()),
                () -> assertEquals("Unidades",producto.getUnidadMedida()),
                () -> assertEquals(10.50F,producto.getPreciobase())
        );
    }

    @Test
    public void TestToString(){
        String str = producto.toString();
        assertAll("Validar datos producto",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Blinker Plus")),
                () -> assertTrue(str.contains("Antiparasitario para gatos, externo gotero")),
                () -> assertTrue(str.contains("gotero")),
                () -> assertTrue(str.contains("frasco")),
                () -> assertTrue(str.contains("5.99F"))
                );
    }
}
