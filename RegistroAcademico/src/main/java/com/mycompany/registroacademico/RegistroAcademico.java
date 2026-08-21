/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registroacademico;

import java.util.Scanner;

/**
 *
 * @author camper
 */
public class RegistroAcademico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos estudiantes desea ingresar? ");
        int n = Integer.parseInt(sc.nextLine());
        Estudiante[] estudiantes = new Estudiante[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Estudiante " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            Estudiante e = new Estudiante(nombre);

            System.out.print("Cuantas asignaturas cursa? ");
            int cantAsignaturas = Integer.parseInt(sc.nextLine());
            for (int j = 0; j < cantAsignaturas; j++) {
                System.out.print("Nombre de la asignatura " + (j + 1) + ": ");
                String nombreAsig = sc.nextLine();
                System.out.print("Nota final de " + nombreAsig + ": ");
                double nota = Double.parseDouble(sc.nextLine());
                e.agregarAsignatura(nombreAsig, nota);
            }

            estudiantes[i] = e;
        }

        double sumaPromedios = 0;
        int aprobados = 0, reprobados = 0;
        Estudiante mayor = estudiantes[0];
        Estudiante menor = estudiantes[0];

        for (Estudiante e : estudiantes) {
            sumaPromedios += e.getPromedio();
            if (e.aprobo()) aprobados++; else reprobados++;
            if (e.getPromedio() > mayor.getPromedio()) mayor = e;
            if (e.getPromedio() < menor.getPromedio()) menor = e;
        }

        System.out.println("\n--- ESTADISTICAS DEL GRUPO ---");
        System.out.printf("Promedio general: %.2f%n", sumaPromedios / n);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
        System.out.printf("Mayor promedio: %s (%.2f)%n", mayor.getNombre(), mayor.getPromedio());
        System.out.printf("Menor promedio: %s (%.2f)%n", menor.getNombre(), menor.getPromedio());
    }
}