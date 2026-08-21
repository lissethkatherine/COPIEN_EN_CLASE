/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema.evaluacion;

import java.util.Scanner;

/**
 *
 * @author camper
 */
public class SistemaEvaluacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Ingrese du edad:");
        int edad = sc.nextInt();
        
        System.out.println("Ingrese su nota final");
        float nota = sc.nextInt();
        
        System.out.println("Ingrese el dia de la semana (1-7");
        int dia = sc.nextInt();
        
        System.out.println("Ingrese el estado de asistencia");
        boolean estado = sc.nextBoolean();
        
        // TERNARIO
        String condicionEdad = (edad >= 18) ? "Es mayor de edad" : "Es menor de edad";
        
        char calificacion;
        if (nota>=90){
            calificacion='E';
        }else if (nota>=80){
            calificacion='S';
        }else if (nota>=70){
            calificacion='A';
        }else if (nota>=60){
            calificacion='I';
        }else if (nota<=0 && nota >60) calificacion 'D;{
            calificacion='D';
        } else System.out.println("Nota no valida ;(");
        
        String nombreDia;
        switch(dia){
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;  
            case 5:
                nombreDia = "Viernes";
                break; 
            case 6:
                nombreDia = "Sabado";
                break;  
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Numero de dia no valido.";
                break;
        }
    }
}
