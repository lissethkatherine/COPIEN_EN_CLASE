/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemanotificaciones;

/**
 *
 * @author camper
 */
public abstract class Notificacion {
    protected String destinatario;
    protected String mensaje;

    public Notificacion(String pDestinatario, String pMensaje) {
        this.destinatario = pDestinatario;
        this.mensaje = pMensaje;   
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getMensaje() {
        return mensaje;
    }
    
    public abstract String getTipo();
}
