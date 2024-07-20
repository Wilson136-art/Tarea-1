/*
 Crear un programa que imprima en consola un nombre de estudiante,
una nota y una etiqueta que diga Aprobado o Reprobado, dependiendo del valor de la nota que tenga. 
Elaborado por: Wilson Ricardo Flores Juarez
Cuenta:202230120066
Nota: el programa pide que ingrese el nombre del estudiante y la nota
 */

package com.mycompany.evaluacionestudiante;

import java.util.Scanner;

public class EvaluacionEstudiante {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = scanner.nextLine();

        System.out.print("Ingrese la nota del estudiante: ");
        double nota = scanner.nextDouble();

        String resultado;
        if (nota >= 60) {
            resultado = "Aprobado";
        } else {
            resultado = "Reprobado";
        }

        System.out.println("Nombre: " + nombreEstudiante);
        System.out.println("Nota: " + nota);
        System.out.println("Estado: " + resultado);
    }
    }

