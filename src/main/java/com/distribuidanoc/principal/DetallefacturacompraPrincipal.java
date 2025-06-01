package com.distribuidanoc.principal;

import com.distribuidanoc.entities.Detallefacturacompra;
import com.distribuidanoc.entities.Facturacompra;
import com.distribuidanoc.entities.Producto;

import java.util.Date;

public class DetallefacturacompraPrincipal {
    public static void main(String[] Args){
        Detallefacturacompra detallefacturacompra = new Detallefacturacompra(1,"120",0.35F,"15%",42.00F);

        Producto producto = new Producto(1, "Blinker Plus", "Antiparasitario para perros, externo Tableta masticable", "Tabletas", "120 Und",10.99F);
        Facturacompra facturacompra = new Facturacompra(1,new Date(),"48.3");


        detallefacturacompra.setProducto(producto);
        detallefacturacompra.setFacturacompra(facturacompra);

        System.out.println(detallefacturacompra.toString());
    }
}
