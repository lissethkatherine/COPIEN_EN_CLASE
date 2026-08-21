/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tiendaonline;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author camper
 */
public class TiendaOnline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Producto[] catalogoCompleto = {
            new Producto("Laptop", 3500.0, 5, "Electronica"),
            new Producto("Mouse", 50.0, 20, "Electronica"),
            new Producto("Teclado", 80.0, 15, "Electronica"),
            new Producto("Monitor", 900.0, 8, "Electronica"),
            new Producto("Arroz", 15.0, 50, "Alimentos"),
            new Producto("Aceite", 25.0, 30, "Alimentos")
        };

        System.out.println("Categorias disponibles: Electronica, Alimentos");
        System.out.print("Que categoria quiere ver? (o escriba 'Todas'): ");
        String categoriaElegida = sc.nextLine();

        // armamos el catalogo que se va a mostrar segun la categoria elegida
        ArrayList<Producto> catalogo = new ArrayList<>();
        for (Producto p : catalogoCompleto) {
            if (categoriaElegida.equalsIgnoreCase("Todas") || p.getCategoria().equalsIgnoreCase(categoriaElegida)) {
                catalogo.add(p);
            }
        }

        if (catalogo.isEmpty()) {
            System.out.println("No hay productos en esa categoria.");
            return;
        }

        Carrito carrito = new Carrito();
        int opcion;
        do {
            System.out.println("\n--- CATALOGO (" + categoriaElegida + ") ---");
            for (int i = 0; i < catalogo.size(); i++) {
                Producto p = catalogo.get(i);
                System.out.println((i + 1) + ". " + p.getNombre() +
                        " - $" + p.getPrecio() + " (Stock: " + p.getStock() + ")");
            }
            System.out.println((catalogo.size() + 1) + ". Finalizar compra");
            System.out.print("Elija un producto: ");
            opcion = Integer.parseInt(sc.nextLine());

            if (opcion >= 1 && opcion <= catalogo.size()) {
                Producto seleccionado = catalogo.get(opcion - 1);
                System.out.print("Cantidad: ");
                int cantidad = Integer.parseInt(sc.nextLine());
                if (carrito.agregarProducto(seleccionado, cantidad)) {
                    System.out.println("Producto agregado al carrito.");
                } else {
                    System.out.println("Stock insuficiente.");
                }
            }
        } while (opcion != catalogo.size() + 1);

        carrito.mostrarFactura();
    }
}