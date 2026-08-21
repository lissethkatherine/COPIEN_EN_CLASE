/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.configuracionapp;

/**
 *
 * @author camper
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIN Singleton (new) ===");
        ConfiguracionApp c1 = new ConfiguracionApp();
        ConfiguracionApp c2 = new ConfiguracionApp();
        c1.setModo("desarrollo");
        System.out.println("c1 modo: " + c1.getModo());
        System.out.println("c2 modo: " + c2.getModo());
        System.out.println("¿Son el mismo objeto? " + (c1 == c2));

        System.out.println();
        System.out.println("=== CON Singleton (getInstance) ===");
        ConfiguracionApp s1 = ConfiguracionApp.getInstance();
        ConfiguracionApp s2 = ConfiguracionApp.getInstance();
        s1.setModo("desarrollo");
        System.out.println("s1 modo: " + s1.getModo());
        System.out.println("s2 modo: " + s2.getModo());
        System.out.println("¿Son el mismo objeto? " + (s1 == s2));
    }
}