/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendaonline;

import java.util.ArrayList;

/**
 *
 * @author camper
 */
public class Carrito {
    private ArrayList<Producto> productos = new ArrayList<>();
    private ArrayList<Integer> cantidades = new ArrayList<>();

    public boolean agregarProducto(Producto p, int cantidad) {
        if (p.hayStock(cantidad)) {
            p.disminuirStock(cantidad);
            productos.add(p);
            cantidades.add(cantidad);
            return true;
        }
        return false;
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < productos.size(); i++) {
            total += productos.get(i).getPrecio() * cantidades.get(i);
        }
        return total;
    }

    public void mostrarFactura() {
        System.out.println("\n FACTURA");
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            int cant = cantidades.get(i);
            System.out.printf("%s x%d - $%.2f%n", p.getNombre(), cant, p.getPrecio() * cant);
        }
        System.out.printf("TOTAL A PAGAR: $%.2f%n", calcularTotal());
    }
}

