/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manejoarchivos;

import java.io.Serializable;

/**
 *
 * @author camper
 */
public class Producto implements Serializable {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String pNombre, double pPrecio, int pStock) {
        nombre = pNombre;
        precio = pPrecio;
        stock = pStock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    
    @Override //Metodo sobreEscrito
    public String toString(){
        return "Producto{"+
                "nombre="+nombre+
                "precio"+precio+
                "stock"+stock+
                "}";
    }         
}
