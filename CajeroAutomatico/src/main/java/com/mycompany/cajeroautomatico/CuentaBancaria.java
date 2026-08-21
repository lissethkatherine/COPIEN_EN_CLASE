/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cajeroautomatico;

/**
 *
 * @author camper
 */
public class CuentaBancaria {

    private String titular;
    private double saldo;
    private String pin;

    public CuentaBancaria(String titular, double saldoInicial, String pin) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.pin = pin;
    }

    public String getTitular() {
        return titular;
    }

    public boolean validarPin(String pinIngresado) {
        return this.pin.equals(pinIngresado);
    }

    public double consultarSaldo() {
        return saldo;
    }

    public boolean retirar(double monto) {
        if (monto <= 0 || monto > saldo) {
            return false;
        }
        saldo -= monto;
        return true;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    1
        }
        if (cuentaDestino == null || cuentaDestino == this) {
            return false;
        }
        if (this.retirar(monto)) {
            cuentaDestino.depositar(monto);
            return true;
        }
        return false;
    }
}

