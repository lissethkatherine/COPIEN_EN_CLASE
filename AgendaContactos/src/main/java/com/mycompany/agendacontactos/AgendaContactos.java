/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agendacontactos;

import java.util.Scanner;

/**
 *
 * @author camper
 */

public class AgendaContactos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int opcion;

        do {
            System.out.println("\n AGENDA DE CONTACTOS ");
            System.out.println("1. Registrar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Listar contactos");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Telefono: ");
                    String telefono = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    if (agenda.agregarContacto(new Contacto(nombre, telefono, email))) {
                        System.out.println("Contacto agregado.");
                    } else {
                        System.out.println("Contacto repetido o agenda llena.");
                    }
                    break;
                case 2:
                    System.out.print("Nombre a buscar: ");
                    String buscar = sc.nextLine();
                    Contacto encontrado = agenda.buscarContacto(buscar);
                    if (encontrado != null) encontrado.mostrarInfo();
                    else System.out.println("Contacto no encontrado.");
                    break;
                case 3:
                    agenda.mostrarTodos();
                    break;
                case 4:
                    System.out.print("Nombre a eliminar: ");
                    String eliminar = sc.nextLine();
                    if (agenda.eliminarContacto(eliminar)) System.out.println("Contacto eliminado.");
                    else System.out.println("Contacto no encontrado.");
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 5);
    }
}