/*
Crear un arreglo multidimensional que guarde más datos personales tus compañeros de clase 
(nombre, apellido, carrera, lugarTrabajo),
tomando como referencia de la información colocada en el foro Conociendonos. Llenar 5 registros Ejemplo:
Elaborado por: Wilson Ricardo Flores Juarez
Cuenta:202230120066
 */

package com.mycompany.arreglomultidimencional;

/**
 *
 * @author Usuario
 */
public class ArregloMultidimencional {

    public static void main(String[] args) {
       String[][] compañeros = {
            {"Ema", "Gomez", "Electronica", "TEST"},
            {"Jhony", "Amaya", "Computacion", "IMSA"},
            {"Blanca", "Bonilla", "Mecanica", "AutoTech"},
            {"Dunia", "Cabrera", "Industrial", "ProInd"},
            {"David", "Perez", "Sistemas", "TechSolutions"}
        };

        // Imprimir los datos de los compañeros
        for (int i = 0; i < compañeros.length; i++) {
            System.out.println("Nombre: " + compañeros[i][0]);
            System.out.println("Apellido: " + compañeros[i][1]);
            System.out.println("Carrera: " + compañeros[i][2]);
            System.out.println("Lugar de Trabajo: " + compañeros[i][3]);
            System.out.println(); // Línea en blanco para separar cada compañero
        }
    }
    }

