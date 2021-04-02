package co.com.practicaJava.ejercicio1_2;

import java.util.Scanner;
/*
* 1. Declara dos variables numéricas, indicar cual es el mayor o si son iguales
*
* 2. Al ejercicio anterior agregar entrada por consola e indicar si son mayores, menores o iguales
* */
public class Comparacion {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Ingresa dos números: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();

        System.out.println(comparacion(num1, num2));

    }

    public static String comparacion(int a, int b) {
        if (esDiferente(a, b)) {
            return (esMayor(a, b)) ? a + " es mayor que " + b : a + " es menor que " + b;
        } else{
            return "Ambos son iguales";
        }
    }

    public static boolean esMayor(int a, int b){
        return a > b;
    }

    public static boolean esDiferente(int a, int b){
        return a != b;
    }

}
