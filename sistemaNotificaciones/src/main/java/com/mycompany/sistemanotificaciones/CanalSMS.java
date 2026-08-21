/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemanotificaciones;

/**
 *
 * @author camper
 */
public class CanalSMS implements CanalNotificacion{
    @Override
    public void enviar(Notificacion notificacion){
        System.out.println("ENVIANDO SMS");
        System.out.println("Destinatario"+notificacion.getDestinatario());
        System.out.println("Mensaje"+notificacion.getMensaje());
    }
}
