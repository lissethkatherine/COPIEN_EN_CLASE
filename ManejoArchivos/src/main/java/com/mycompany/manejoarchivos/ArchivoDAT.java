/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manejoarchivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author camper
 * FileOutputStream : abre el flujo
 * ObjectOutputStream : permite la escritura sobre el archivo
 * FileInputStream : apertura para que los bytes puedan ser leidos
 */

public class ArchivoDAT {
    public static void guardar(List<Producto> productos, String ruta){
        try(FileOutputStream archivo = new FileOutputStream(ruta);
                ObjectOutputStream salida = new ObjectOutputStream(archivo)) {
            salida.writeObject(productos);
            
            System.out.println("DAT guardado correctamente");
        }catch(IOException e){
            System.out.println("Error guardando DAT"+e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked") 
    //Permite trabajar con objestos de otro tipo hasta que los convirtamos
    
    public static List<Producto> cargar(String ruta){
        try(FileInputStream archivo = new FileInputStream(ruta);
                ObjectInputStream entrada = new ObjectInputStream(archivo)){
            return (List<Producto>)entrada.readObject();
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Error leyendo el Dat"+e.getMessage());
            return new ArrayList<>();
        }
    }

}