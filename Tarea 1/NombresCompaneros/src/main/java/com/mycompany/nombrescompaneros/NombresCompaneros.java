/*
 * Crear un arrelo que guarde e imprima 10 nombres de tus compañeros de la clase
Elaborado por: Wilson Ricardo Flores Juarez
Cuenta:202230120066
 */
package com.mycompany.nombrescompaneros;


public class NombresCompaneros {
  public static void main(String[]args){
     String[] nombres={
          "Wilson Flores",
         "Ema Gomez",
         "Cristhy Pineda",
         "Jhony Amaya",
         "Alex Henrriquez",
         "Blanca Bonilla",
         "Dunia Cabrera",
         "Yajaira Enamorado",
         "David Perez",
         "Riccy Garcia",
     };
   System.out.println("Nombrees de mis companeros de clase:");
   for(int i=0;i<nombres.length;i++){
    System.out.println((i+1)+"."+nombres[i]);
           
   }    
  }
      
  }
  