package co.com.practicaJava.ejercicio14;

import java.util.Scanner;

public class App {

    /*
    * 14.
    * */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Numero numero = new Numero();

        System.out.println("Introduce un número menor a 1000: ");
        numero.listarNumeros(entrada.nextInt());
    }
}
