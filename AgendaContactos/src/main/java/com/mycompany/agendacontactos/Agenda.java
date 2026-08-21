/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.agendacontactos;

import java.util.ArrayList;

/**
 *
 * @author camper
 */

public class Agenda {
    private ArrayList<Contacto> contactos = new ArrayList<>();

    // ahora no hay limite de contactos, la lista crece sola
    public boolean agregarContacto(Contacto c) {
        for (Contacto existente : contactos) {
            if (existente.getNombre().equalsIgnoreCase(c.getNombre())
                    || existente.getTelefono().equals(c.getTelefono())) {
                return false;
            }
        }
        contactos.add(c);
        return true;
    }

    public Contacto buscarContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) return c;
        }
        return null;
    }

    public void mostrarTodos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos registrados.");
            return;
        }
        for (Contacto c : contactos) c.mostrarInfo();
    }

    public boolean eliminarContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                contactos.remove(c);
                return true;
            }
        }
        return false;
    }
}