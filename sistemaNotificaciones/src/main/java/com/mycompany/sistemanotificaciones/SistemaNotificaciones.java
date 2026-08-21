/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemanotificaciones;

/**
 *
 * @author camper
 */
public class SistemaNotificaciones {

    public static void main(String[] args) {
        Notificacion notificacion = new NotificacionEmail(
                "email@gmail.com",
                "Mensaje de prueba");
        CanalNotificacion canal = new CanalEmail();
        
        RegistroNotificacion registro = new RegistroConsola();
        
        Notificador notificador = new Notificador(canal,registro);
        
        notificador.procesar(notificacion);
    }
}
