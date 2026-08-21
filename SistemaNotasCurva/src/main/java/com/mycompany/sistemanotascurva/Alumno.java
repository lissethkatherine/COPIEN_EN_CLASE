/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemanotascurva;

/**
 *
 * @author camper
 */
public class Alumno {
    private String nombre;
    private double notaOriginal;
    private double notaFinal;

    public Alumno(String nombre, double notaOriginal) {
        this.nombre = nombre;
        this.notaOriginal = notaOriginal;
        this.notaFinal = notaOriginal;
    }

    // en vez de sumar puntos fijos, la nota sube un porcentaje de su valor
    public void aplicarCurvaPorcentual(double porcentaje) {
        notaFinal = notaOriginal + (notaOriginal * porcentaje / 100);
        if (notaFinal > 10) notaFinal = 10;
    }

    public boolean estaAprobado() {
        return notaFinal >= 6;
    }

    public String getNombre() { return nombre; }
    public double getNotaOriginal() { return notaOriginal; }
    public double getNotaFinal() { return notaFinal; }
}