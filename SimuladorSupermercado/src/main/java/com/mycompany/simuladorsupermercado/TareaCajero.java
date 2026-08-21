/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simuladorsupermercado;

import java.awt.BorderLayout;

/**
 *
 * @author Liss
 */
public class TareaCajero implements Runnable {
    
    //Cada tarea del cajero tendra el carrito de un cliente
    private final int[] carritoCliente;

    public TareaCajero(int[] pCarritoCliente) {
         carritoCliente = pCarritoCliente;
    }
    
    // Se debe poner al usar el Runnable
    @Override
    public void run(){
        String nombreCajero = Thread.currentThread().getName();
        
        System.out.println("- "+nombreCajero+" ha empezado a procesar un carrito con "+
        carritoCliente.length+"articulos");
        
        //para calcular la duracion del proceso de atender el carrito del cliente
        long tiempoInicio = System.currentTimeMillis();
        
        try{
            for(int i=0; i<carritoCliente.length; i++){
                int tiempoDeProcesado = carritoCliente [i];
                
                System.out.println("------>"+nombreCajero+"procesando "+
                        (i+"tardara: "+tiempoDeProcesado+"ms"));
                
                Thread.sleep(tiempoDeProcesado); //Hilo interrumpido
            }
        }catch(InterruptedException e){
            System.out.println(nombreCajero+"fue interrumnpido;(");
            
            //Limpiar la bandera de interrupcion
            Thread.currentThread().interrupt();
        }
    
    long tiempoFin = System.currentTimeMillis();
    long duracionTotal = tiempoFin - tiempoInicio;
    
    System.out.println("--->"+nombreCajero+"ha terminado. tiempo: "+duracionTotal+"ms");           
    
    }
}