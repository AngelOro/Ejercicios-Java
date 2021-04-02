package co.com.practicaJava.ejercicio12;

import java.util.Scanner;

public class App {

    /*
    * 12. Ingresar dos palabras y decir si son iguales, sino mostrar sus diferencias
    * */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa la primera palabra: ");
        String palabra1 = entrada.nextLine();

        System.out.println("\nIngresa la segunda palabra: ");
        String palabra2 = entrada.nextLine();

        CompararPalabras palabras = new CompararPalabras(palabra1, palabra2);

        System.out.println(palabras.iguales());

    }
}
