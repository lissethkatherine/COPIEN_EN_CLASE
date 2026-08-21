/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cajeroelectronico;

import java.util.Scanner;

/**
 *
 * @author camper
 */
public class Menu {
    
    private Scanner sc;
        
    public Menu(){
            sc = new Scanner(System.in);
    }
        
    public void mostratMenu(){
        
        
        while(true){
            System.out.println("\n====MENU CAJERO====");
            System.out.println("1.Consultar saldo");
            System.out.println("2.Depositar dienero");
            System.out.println("3.Retirar dinero");
            System.out.println("4.Mostrat estadisticas");
            System.out.println("5.Salir");
            
            int opcion = sc.nextInt();
            
            switch (opcion){
                case 1:
            }
        }
    }
}
