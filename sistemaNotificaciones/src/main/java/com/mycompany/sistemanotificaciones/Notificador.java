/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemanotificaciones;

/**
 *
 * @author camper
 */

public class Notificador {
    private CanalNotificacion canal;
    private RegistroNotificacion registro;

    public Notificador(CanalNotificacion pCanal, RegistroNotificacion pRegistro){
        canal = pCanal;
        registro = pRegistro;
    }
    
    public void procesar (Notificacion notificacion){
        canal.enviar(notificacion);
        registro.registrar(notificacion);
    }
}
