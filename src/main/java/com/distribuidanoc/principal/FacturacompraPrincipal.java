package com.distribuidanoc.principal;

import com.distribuidanoc.entities.Facturacompra;
import com.distribuidanoc.entities.Proveedor;

import java.util.Date;

public class FacturacompraPrincipal {
    public static void main(String[] Args){
        Facturacompra facturacompra = new Facturacompra(1,new Date(),"48.3");

        Proveedor proveedor = new Proveedor(1, "Imprenta Mariscal", "Pifo", "023941700", "example@example.com", "171234567001");

        facturacompra.setProveedor(proveedor);

        System.out.println(facturacompra.toString());
    }
}
