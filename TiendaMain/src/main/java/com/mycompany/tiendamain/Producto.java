/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendamain;

/**
 *
 * @author camper
 */
public class Producto {
    private String nombre;
    private String codigo;
    private double precio;
    private int stock;

    public Producto(String pNombre, String pCodigo, double pPrecio, int pStock) {
        nombre = pNombre;
        codigo = pCodigo;
        precio = pPrecio;
        stock = pStock;
    }

    // metodos: vender, reponer, obtener info

    public void vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a vender debe ser positiva.");
        } else if (cantidad > stock) {
            System.out.println("Error: Stock insuficiente de " + nombre + ". Solo quedan " + stock + " unidades.");
        } else {
            stock -= cantidad;
            System.out.println("Venta realizada: " + cantidad + " de " + nombre);
        }
    }

    public void reponer(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a reponer debe ser positiva.");
        } else {
            stock += cantidad;
            System.out.println("Inventario actualizado: " + cantidad + " de " + nombre + " aÃ±adidas.");
        }
    }

    public String getInfoProducto() {
        return "(" + codigo + ") " + nombre + " - Precio: $" + precio + " - Stock: " + stock + " unidades";
    }
}
