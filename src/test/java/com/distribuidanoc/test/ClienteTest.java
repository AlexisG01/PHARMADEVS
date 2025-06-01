package com.distribuidanoc.test;

import com.distribuidanoc.entities.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    public void setUp(){
        cliente = new Cliente(1,"Alexis","Cuenca","0999999997","alexis1234@gmail.com","171717171719001");
    }

    @Test
    public void testClienteConstructorAndGetter(){
        assertAll("Validardatos cliente",
                () -> assertEquals(1,cliente.getIdCliente()),
                () -> assertEquals("Alexis",cliente.getNombre()),
                () -> assertEquals("Cuenca",cliente.getDireccion()),
                () -> assertEquals("0999999997",cliente.getTelefono()),
                () -> assertEquals("alexis1234@gmail.com",cliente.getEmail()),
                () -> assertEquals("171717171719001",cliente.getRuc())
                );
    }

    @Test
    public void testClienteSetters(){
        cliente = new Cliente();

        cliente.setIdCliente(2);
        cliente.setNombre("Max");
        cliente.setDireccion("Quito");
        cliente.setTelefono("099999947");
        cliente.setEmail("max123@example.com");
        cliente.setRuc("17017141415001");

        assertAll("Validar datos de cliente",
                () -> assertEquals(2,cliente.getIdCliente()),
                () -> assertEquals("Max",cliente.getNombre()),
                () -> assertEquals("Quito",cliente.getDireccion()),
                () -> assertEquals("099999947",cliente.getTelefono()),
                () -> assertEquals("max123@example.com",cliente.getEmail()),
                () -> assertEquals("17017141415001",cliente.getRuc())
                );
    }

    @Test
    public void TestToString(){
        String str = cliente.toString();
        assertAll("Validar datos cliente",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Alexis")),
                () -> assertTrue(str.contains("Cuenca")),
                () -> assertTrue(str.contains("0999999997")),
                () -> assertTrue(str.contains("alexis1234@gmail.com")),
                () -> assertTrue(str.contains("171717171719001"))
                );
    }


}
