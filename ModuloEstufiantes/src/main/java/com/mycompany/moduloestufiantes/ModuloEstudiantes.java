/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.moduloestufiantes;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author camper
 */
public class ModuloEstudiantes {
    
    public static void main(String[] args) {
      // Declarar e inciailizar un conjunto Treeset
        Set<Estudiante>  estudiantes = new TreeSet<>(Comparator.comparing(Estudiante::getNombre));
    
        Map<String, Double> notas = new HashMap<>();
        Scanner sc = new Scanner (System.in);
        
        try{
            //Agg estudiantes iniciales
            estudiantes.add(new Estudiante("Fabio", "123", NivelCurso.BASICO));
            estudiantes.add(new Estudiante("Fabia", "321", NivelCurso.INTERMEDIO));
            estudiantes.add(new Estudiante("Fabie", "312", NivelCurso.AVANZADO));
            for (Estudiante e : estudiantes) {
                System.out.println("Ingrese nota para " + e.getNombre() + ": ");
                double nota = sc.nextDouble();
                
                if(nota <0 || nota >10){
                    throw new NotaInvalidaException("la nota es entre 0 y 10");
                }
                
                notas.put(e.getId(), nota);
            }
            
            // CALCULAR NOTAS POR ID
            
            
            
            
            
            
            
            
            // MOSTYRAR LISTADO COMPLETO ORDENADO POR NOMBRE
            
            
            
            
            
            
            
        
        } catch (NotaInvalidaException e) {
            System.out.println("Error:"+e.getMessage());
            // captura error si elñ usuario ingresa letras en lugar de numeros.
        } catch (InputMismatchException e){
            System.out.println("Error: se esperaba un numero valido");
        } catch (Exception e){
            System.out.println("Error general:"+ e.getMessage());
        } finally {
            sc.close();
            System.out.println("Programa finalizado, no vuelva ;)");
        }
    }
}
