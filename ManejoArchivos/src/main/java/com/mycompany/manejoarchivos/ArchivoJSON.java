/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.manejoarchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camper
 */
public class ArchivoJSON {
    public static void guardar(List<Producto> productos, String ruta){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))){
            writer.write("[");
            writer.newLine();

            for(int i=0; i<productos.size();i++){
                Producto producto = productos.get(i);

                writer.write (" {");
                writer.newLine();

                writer.write(
                " \"nombre\":\""+
                producto.getNombre()+
                "\","
                );
                
                writer.write (" {");
                writer.newLine();

                writer.write(
                " \"precio\":"+
                producto.getPrecio()+
                ","
                );
                
                writer.write (" {");
                writer.newLine();

                writer.write(
                " \"stock\":"+
                producto.getStock()
                );
                
                writer.newLine();
                writer.write ("}");
                
                if(i<productos.size()-1){
                    writer.write(",");
                }
                writer.newLine();
            }
            
            writer.write("]");
            
            System.out.println("JSON guardado exitosamente!!!!!");
            
            // IO para leer un archivo que no existe
        }catch(IOException e){
            System.out.println("Error guardando JSON"+e.getMessage());
        }

    }
    public static List<Producto> cargar(String ruta){
        
        //Almacenmiento de productos recuperados
        List<Producto> productos = new ArrayList<>();
        
        try(BufferedReader reader = new BufferedReader(new FileReader(ruta))){
            String linea;
            
            String nombre ="";
            double precio = 0;
            int stock = 0;
            
            while((linea = reader.readLine())!= null){
                 linea = linea.trim();
                 
                if(linea.startsWith("\"nombre\"")){
                     nombre = linea
                             .split(":") [1]
                             .trim()
                             .replace("\"", "")
                             .replace("\"", "");
                }
                     
                if(linea.startsWith("\"Precio\"")){
                    String valor = linea
                            .split(":")[1]
                            .trim()
                            .replace(",", "");
                    precio = Double.parseDouble(valor);
                }
                    
                if(linea.startsWith("\"stock\"")){
                    String valor = linea
                            .split(":")[1]
                            .trim();
                    stock = Integer.parseInt(valor);
                    
                }
                 
                if(linea.equals("}") || linea.equals("},")){
                     Producto producto = new Producto(nombre, precio, stock);
                     productos.add(producto);
                }
            }
            
            System.out.println("Json cargado correctamente!!"); 
        }catch(IOException e){
            System.out.println("Error leyendo Json: "+e.getMessage());
        }
        return productos;
    }
}
     
