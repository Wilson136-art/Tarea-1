/*
 * Crear un programa que imprima en consola todas las operaciones aritméticas de dos números enteros 
(suma, resta, multiplicación, divición, mod)
Elaborado por: Wilson Ricardo Flores Juarez
Cuenta:202230120066
 */

package com.mycompany.operacionesaritmeticas;

import java.util.Scanner;

public class OperacionesAritmeticas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        int division = num1 / num2;

       
        System.out.println("Operaciones aritmeticas con " + num1 + " y " + num2 + ":");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
    }
}
