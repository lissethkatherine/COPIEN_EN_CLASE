/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroacademico;

/**
 *
 * @author camper
 */

public class Asignatura {
    private String nombre;
    private double notaFinal;

    public Asignatura(String nombre, double notaFinal) {
        this.nombre = nombre;
        this.notaFinal = notaFinal;
    }

    public String getNombre() { return nombre; }
    public double getNotaFinal() { return notaFinal; }
}
