/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemanotificaciones;

/**
 *
 * @author camper
 */
public class RegistroConsola implements RegistroNotificacion{
    @Override
    public void registrar(Notificacion notificacion){
        System.out.println("Registrando Notificacion: "+notificacion.getTipo());
    }
}
