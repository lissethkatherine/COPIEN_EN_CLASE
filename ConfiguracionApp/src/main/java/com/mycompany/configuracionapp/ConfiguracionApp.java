/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.configuracionapp;

/**
 *
 * @author camper
 */
public class ConfiguracionApp {
    // Única instancia, se crea recién cuando se pide (lazy)
    private static volatile ConfiguracionApp instancia;

    private String modo; // dato de ejemplo

    // Constructor privado: nadie puede hacer "new" desde afuera
    public ConfiguracionApp() {
        modo = "produccion";
    }

    // Punto de acceso global, con doble chequeo para thread-safety
    public static ConfiguracionApp getInstance() {
        if (instancia == null) {
            synchronized (ConfiguracionApp.class) {
                if (instancia == null) {
                    instancia = new ConfiguracionApp();
                }
            }
        }
        return instancia;
    }

    public String getModo() { return modo; }
    public void setModo(String modo) { this.modo = modo; }
}
