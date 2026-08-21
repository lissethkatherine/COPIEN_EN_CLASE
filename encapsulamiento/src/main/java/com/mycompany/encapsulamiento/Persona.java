/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.encapsulamiento;

/**
 *
 * @author camper
 */
public class Persona {
    public String nombre;
    double estatura;
    String documento;
    double peso;
    int edad;
    String genero;
    String naiconalidad;
    
    public Persona(String pNombre,double pEstatura, String pDocumento, double pPeso, int pEdad, String pGenero, String pNaiconalidad){
        nombre = pNombre;
        estatura = pEstatura;
        documento = pDocumento;
        peso = pPeso;   
        edad = pEdad;  
        genero = pGenero;
        naiconalidad = pNaiconalidad;
    }
    
    public Persona(){
    }
}
