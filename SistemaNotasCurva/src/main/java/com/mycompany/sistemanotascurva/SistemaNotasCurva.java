/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemanotascurva;

import java.util.Scanner;

/**
 *
 * @author camper
 */
public class SistemaNotasCurva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos alumnos desea ingresar? ");
        int n = Integer.parseInt(sc.nextLine());
        Alumno[] alumnos = new Alumno[n];
        double suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Nombre del alumno " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            System.out.print("Nota original: ");
            double nota = Double.parseDouble(sc.nextLine());
            alumnos[i] = new Alumno(nombre, nota);
            suma += nota;
        }

        double promedio = suma / n;
        System.out.printf("%nPromedio del curso: %.2f%n", promedio);

        if (promedio < 6) {
            System.out.println("Se aplicara una curva del 10 por ciento a todos los alumnos.");
            for (Alumno a : alumnos) a.aplicarCurvaPorcentual(10);
        } else {
            System.out.println("No es necesario aplicar curva.");
        }

        System.out.println("\n--- LISTADO FINAL ---");
        for (Alumno a : alumnos) {
            System.out.printf("%s | Nota original: %.2f | Nota final: %.2f | %s%n",
                    a.getNombre(), a.getNotaOriginal(), a.getNotaFinal(),
                    a.estaAprobado() ? "APROBADO" : "REPROBADO");
        }
    }
}