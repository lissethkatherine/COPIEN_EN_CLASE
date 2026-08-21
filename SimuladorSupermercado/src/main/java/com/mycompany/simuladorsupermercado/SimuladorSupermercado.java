/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simuladorsupermercado;

/**
 *
 * @author camper
 */
public class SimuladorSupermercado {

    public static void main(String[] args) {
        System.out.println("vA A CERRAR. ATENDIENDO A LOS ULTIMOS");
        System.out.println("---------------");
        
        //creacion de carritos d clientes
        int[] carrito1 = {100,200,10,350}; //4 Articulos
        int[] carrito2 = {500,900,520,350}; //4 Articulos
        int[] carrito3 = {105,220,50}; //3 Articulos
        
        
        TareaCajero tarea1 = new TareaCajero(carrito1);
        TareaCajero tarea2 = new TareaCajero(carrito2);
        TareaCajero tarea3 = new TareaCajero(carrito3);
        
        Thread cajero1 = new Thread(tarea1, "Cajero; 1");
        Thread cajero2 = new Thread(tarea2, "Cajero; 2"); 
        Thread cajero3 = new Thread(tarea3, "Cajero; 3");
        
        //Para el metodo run() y que el hilo empiece a trabajar
        cajero1.start();
        cajero2.start();
        cajero3.start();
        
        //Esperar a que los cajeros terminen
        //Join --> TERMINADO
        
        try{
            System.out.println("[Gerente] Esperando a qu etodos los cajeros terminen su trabajo");
            
            cajero1.join(); //Espera a que le 1 termine
            cajero2.join(); //Espera
            cajero3.join(); //Espera ----->Finializa
        }catch(InterruptedException e){
            System.out.println("fue interrumpido el hilo ;(");
            Thread.currentThread().interrupt();
        }
        
        System.out.println("--------");
        System.out.println("Todos fueron atendidos, puede cerrar :)");
    }
}
