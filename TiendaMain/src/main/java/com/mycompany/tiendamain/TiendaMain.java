/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiendamain;

/**
 *
 * @author camper
 */
public class TiendaMain {

    public static void main(String[] args) {
        Producto leche = new Producto("Leche", "LAC-001", 1.50, 20);
        Producto pan = new Producto("Pan", "PAN-001", 0.80, 5);
        Producto huevos = new Producto("Huevos", "HUE-001", 3.20, 30);

        Vendedor carlos = new Vendedor("Carlos", 101);

        System.out.println("Estado inicial");
        System.out.println(leche.getInfoProducto());
        System.out.println(pan.getInfoProducto());
        System.out.println(huevos.getInfoProducto());

        System.out.println("Venta exitosa");
        carlos.registrarVenta(leche, 5);

        System.out.println("Venta fallida (stock insuficiente)");
        carlos.registrarVenta(pan, 10);

        System.out.println("Reposicion de stock");
        carlos.registrarLlegadaStock(pan, 15);

        System.out.println("Venta exitosa despues de reponer");
        carlos.registrarVenta(pan, 10);

        System.out.println("Estado final");
        System.out.println(leche.getInfoProducto());
        System.out.println(pan.getInfoProducto());
        System.out.println(huevos.getInfoProducto());
    }
}
