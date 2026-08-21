/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cajeroautomatico;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author camper
 */
public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        banco.agregarCuenta(new CuentaAhorro("Liss", 1000.0, "1234", 0.02));
        banco.agregarCuenta(new CuentaCorriente("Carlos", 500.0, "5678", 200.0));
        banco.agregarCuenta(new CuentaAhorro("Maria", 250.0, "9999", 0.02));

        System.out.print("Ingrese su titular (ID de cliente): ");
        String titular = sc.nextLine();
        Cuenta cuenta = banco.buscarCuenta(titular);

        if (cuenta == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        int intentos = 0;
        boolean acceso = false;
        while (intentos < 3) {
            System.out.print("Ingrese su PIN: ");
            String pinIngresado = sc.nextLine();
            if (banco.validarPin(titular, pinIngresado)) {
                acceso = true;
                break;
            } else {
                intentos++;
                System.out.println("PIN incorrecto. Intentos restantes: " + (3 - intentos));
            }
        }

        if (!acceso) {
            System.out.println("Cuenta bloqueada.");
            return;
        }

        int opcion;
        do {
            System.out.println("\n Menu cajero");
            System.out.println("1.Consultar saldo");
            System.out.println("2.Retirar dinero");
            System.out.println("3.Depositar dinero");
            System.out.println("4.Transferir dinero");
            System.out.println("5.Consultar movimientos");
            System.out.println("6.Salir");
            System.out.print("Elija una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es: $" + cuenta.consultarSaldo());
                    break;
                case 2:
                    System.out.print("Ingrese monto a retirar: ");
                    double montoRetiro = Double.parseDouble(sc.nextLine());
                    if (cuenta.retirar(montoRetiro)) {
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + cuenta.consultarSaldo());
                    } else {
                        System.out.println("Monto invalido o saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese monto a depositar: ");
                    double montoDeposito = Double.parseDouble(sc.nextLine());
                    if (montoDeposito <= 0) {
                        System.out.println("Monto invalido.");
                    } else {
                        cuenta.depositar(montoDeposito);
                        System.out.println("Deposito exitoso. Nuevo saldo: $" + cuenta.consultarSaldo());
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el titular de la cuenta destino: ");
                    String titularDestino = sc.nextLine();
                    Cuenta destino = banco.buscarCuenta(titularDestino);
                    System.out.print("Ingrese monto a transferir: ");
                    double montoTransferencia = Double.parseDouble(sc.nextLine());
                    if (cuenta.transferir(destino, montoTransferencia)) {
                        System.out.println("Transferencia exitosa. Nuevo saldo: $" + cuenta.consultarSaldo());
                    } else {
                        System.out.println("No se pudo realizar la transferencia.");
                    }
                    break;
                case 5:
                    System.out.println("Ultimos movimientos:");
                    for (String mov : cuenta.getMovimientos()) {
                        System.out.println("- " + mov);
                    }
                    break;
                case 6:
                    System.out.println("Gracias por usar el cajero.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 6);
    }
}
