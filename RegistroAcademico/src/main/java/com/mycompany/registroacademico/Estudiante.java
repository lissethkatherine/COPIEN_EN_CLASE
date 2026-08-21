/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroacademico;

/**
 *
 * @author camper
 */

public class Estudiante {
    private String nombre;
    private ArrayList<Asignatura> asignaturas;
    private double promedio;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.asignaturas = new ArrayList<>();
        this.promedio = 0;
    }

    public void agregarAsignatura(String nombreAsignatura, double nota) {
        asignaturas.add(new Asignatura(nombreAsignatura, nota));
        calcularPromedio();
    }

    // el promedio ahora se saca sumando todas las asignaturas cargadas
    public void calcularPromedio() {
        if (asignaturas.isEmpty()) {
            promedio = 0;
            return;
        }
        double suma = 0;
        for (Asignatura a : asignaturas) {
            suma += a.getNotaFinal();
        }
        promedio = suma / asignaturas.size();
    }

    public boolean aprobo() {
        return promedio >= 6;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }
}