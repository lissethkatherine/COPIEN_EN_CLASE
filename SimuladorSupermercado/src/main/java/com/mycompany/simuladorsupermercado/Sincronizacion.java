/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorsupermercado;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicInteger;

public class Sincronizacion {
    
    static AtomicInteger contador = new AtomicInteger(0);
    
    static volatile boolean eventoAbierto = true;
    
    static final Object lock = new Object();
    
    static void registrarPersona (){        
        contador.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException{
        Thread puerta1 = new Thread(()->{
            while(eventoAbierto){
                registrarPersona();
            }
             
        });
        
        Thread puerta2 = new Thread(()->{
            while(eventoAbierto){
                registrarPersona();
            }
             
        });
        
        
        puerta1.start();
        puerta2.start();
        
        Thread.sleep(3000);
        eventoAbierto = false;
        
        puerta1.join();
        puerta2.join();
        
        System.out.println("Personas registradas"+contador);
        
        //RACE CONDITION
    }   
}
