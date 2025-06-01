package com.distribuidanoc.test;

import com.distribuidanoc.entities.Proveedor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProveedorTest {

    private Proveedor proveedor;

    @BeforeEach
    public void setUp(){
        proveedor = new Proveedor(1, "Dog Chao", "Pifo", "023941700", "dogchao@gmail.com", "171234568001");
    }

    @Test
    public void testProveedorConstructorAndGetter(){
        assertAll("Validar datos proveedor",
                () -> assertEquals(1,proveedor.getIdProveedor()),
                () -> assertEquals("Dog Chao",proveedor.getNombre()),
                () -> assertEquals("Pifo",proveedor.getDireccion()),
                () -> assertEquals("023941700",proveedor.getTelefono()),
                () -> assertEquals("dogchao@gmail.com",proveedor.getEmail()),
                () -> assertEquals("171234568001",proveedor.getRuc())
                );
    }

    @Test
    public void testProveedorSetter(){
        proveedor = new Proveedor();

        proveedor.setIdProveedor(2);
        proveedor.setNombre("Alexander");
        proveedor.setDireccion("Guaman");
        proveedor.setTelefono("0993095547");
        proveedor.setEmail("aguaman@example.com");
        proveedor.setRuc("17171702001");

        assertAll("Validar datos proveedor",
                () -> assertEquals(2,proveedor.getIdProveedor()),
                () -> assertEquals("Alexander",proveedor.getNombre()),
                () -> assertEquals("Guaman",proveedor.getDireccion()),
                () -> assertEquals("0993095547",proveedor.getTelefono()),
                () -> assertEquals("aguaman@example.com",proveedor.getEmail()),
                () -> assertEquals("17171702001",proveedor.getRuc())
        );
    }

    @Test
    public void TestToString(){
        String str = proveedor.toString();
        assertAll("Validar datos proveedor",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Dog Chao")),
                () -> assertTrue(str.contains("Pifo")),
                () -> assertTrue(str.contains("023941700")),
                () -> assertTrue(str.contains("dogchao@gmail.com")),
                () -> assertTrue(str.contains("171234502001"))
                );

    }
}
