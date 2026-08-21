/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemanotificaciones;

/**
 *
 * @author camper
 */
public class NotificacionSMS extends Notificacion{
    public NotificacionSMS(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }
    
    @Override
    public String getTipo(){
        return "SMS";
    }
}
