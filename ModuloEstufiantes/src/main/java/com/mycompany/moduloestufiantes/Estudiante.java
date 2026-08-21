/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.moduloestufiantes;

import java.util.Objects;



/**
 *
 * @author camper
 */
public class Estudiante {

    // Atributos públicos del estudiante
    public String nombre;
    public String id;
    public NivelCurso nivel;

    // Constructor para inicializar un estudiante
    public Estudiante(String nombre, String id, NivelCurso nivel) {
        this.nombre = nombre;
        this.id = id;
        this.nivel = nivel;
    }

    // Devuelve el nombre del estudiante
    public String getNombre() {
        return nombre;
    }

    // Devuelve el ID del estudiante
    public String getId() {
        return id;
    }

    // Devuelve el nivel del curso del estudiante
    public NivelCurso getNivel() {
        return nivel;
    }

    // Devuelve una representación en texto del estudiante
    @Override
    public String toString() {
        return nombre + " ID: " + id + " - Nivel: " + nivel;
    }

    // Compara dos estudiantes por su ID para evitar duplicados
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Si son el mismo objeto, son iguales
        if (!(o instanceof Estudiante)) return false; // Si el objeto no es un Estudiante, no son iguales
        Estudiante e = (Estudiante) o; // Convierte el objeto a Estudiante
        return Objects.equals(id, e.id); // Compara los ID de ambos estudiantes
    }
}