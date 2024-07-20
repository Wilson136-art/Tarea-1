
package com.mycompany.operacionesexpreciones;

/**
 Dadas las variables de tipo int M = 6, T = 1, K = -10 indicar si la evaluación de estas expresiones daría como resultado verdadero o falso:
M > T
T / K == -5
(M+T == 7) || (M-T == 5)
Elaborado por: Wilson Ricardo Flores Juarez
Cuenta:202230120066
*/
public class OperacionesExpreciones {

    public static void main(String[] args) {
        int M = 6;
        int T = 1;
        int K = -10;

        // Evaluar M > T
        boolean resultado1 = M > T;
        System.out.println("M > T: " + (resultado1 ? "Verdadero" : "Falso"));

        // Evaluar T / K == -5
        boolean resultado2 = T / K == -5;
        System.out.println("T / K == -5: " + (resultado2 ? "Verdadero" : "Falso"));

        // Evaluar (M + T == 7) || (M - T == 5)
        boolean resultado3 = (M + T == 7) || (M - T == 5);
        System.out.println("(M + T == 7) || (M - T == 5): " + (resultado3 ? "Verdadero" : "Falso"));
    }
}
