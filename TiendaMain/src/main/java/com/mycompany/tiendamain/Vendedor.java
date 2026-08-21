/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tiendamain;

/**
 *
 * @author camper
 */
public class Vendedor {
    private String nombre;
    private int idEmpleado;

    public Vendedor(String pNombre, int pIdEmpleado) {
        nombre = pNombre;
        idEmpleado = pIdEmpleado;
    }

    public void registrarVenta(Producto pProducto, int cantidad) {
        System.out.println(nombre + " intenta vender un producto");
        pProducto.vender(cantidad);
    }

    public void registrarLlegadaStock(Producto pProducto, int cantidad) {
        System.out.println(nombre + " esta reponiendo stock");
        pProducto.reponer(cantidad);
    }
}