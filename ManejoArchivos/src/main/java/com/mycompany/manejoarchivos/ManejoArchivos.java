/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manejoarchivos;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author camper
 */
public class ManejoArchivos {

    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        
        productos.add(new Producto("Panela ", 5000,5));
        productos.add(new Producto("Arroz ", 20000,20));
        productos.add(new Producto("Frijoles ", 30000,5));
        productos.add(new Producto("Lentejas ", 50000,10));
        
        for(Producto producto : productos){
            System.out.println(producto);
        }
        
        //GUARDAR EN JSON
        ArchivoJSON.guardar(productos, "productos.json");
        
        //GUARDAR EN DAT
        ArchivoDAT.guardar(productos, "productos.dat");
        
        //CARGAR DESDE JSON
        List<Producto> productoJSON = ArchivoJSON.cargar("Productos.json");
        
        for(Producto producto : productoJSON){
            System.out.println(producto);
        }
        
        // CARGAR DESDE DAT 
        List<Producto> productosDAT = ArchivoDAT.cargar("productos.dat");
        for( Producto producto: productosDAT){
            System.out.println(producto);
        }
    }
}
