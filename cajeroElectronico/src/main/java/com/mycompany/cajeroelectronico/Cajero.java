/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cajeroelectronico;

/**
 *
 * @author camper
 */
public class Cajero {
    private double saldo; // Almacena el saldo actual de la cuenta.
    private int cantidadDepositos; // Guarda la cantidad de depósitos realizados.
    private int cantidadRetiros; // Guarda la cantidad de retiros realizados.
    private double totalDepositado; // Acumula el total de dinero depositado.
    private double totalRetirado; // Acumula el total de dinero retirado.

    // Constructor: inicializa el saldo y los contadores en cero.
    public Cajero(double pSaldo) {
        saldo = pSaldo;
        cantidadDepositos = 0;
        cantidadRetiros = 0;
        totalDepositado = 0;
        totalRetirado = 0;
    }

    // Devuelve el saldo actual de la cuenta.
    public double getSaldo() {
        return saldo;
    }

    // Realiza un depósito y actualiza los registros.
    public void depositar(double pMonto) {
        saldo += pMonto;
        cantidadDepositos++;
        totalDepositado += pMonto;
    }

    // Realiza un retiro y actualiza los registros.
    public void retiros(double pMonto) {
        saldo -= pMonto;
        cantidadRetiros++;
        totalRetirado += pMonto;
    }
    
    public void mostrarEstadisticas(){
        System.out.println("-cantidad depositos: "+cantidadDepositos);
        System.out.println("-cantidad retiros: "+cantidadRetiros);
        System.out.println("-total depositado: "+totalDepositado);
        System.out.println("-total retirado: "+totalRetirado);
    }
}