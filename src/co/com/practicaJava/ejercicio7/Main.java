package co.com.practicaJava.ejercicio7;

import java.util.Scanner;

public class Main {
    /*
    * 7. Leer número por teclado y comprobar si es mayor o igual a cero, si no lo es lo volverá a pedir
    * */
    public static void main(String[] args) {

        int numero;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("\n Ingresa un número mayor o igual a cero: ");
            numero = entrada.nextInt();
        }while (numero < 0);

        System.out.println(numero);
    }
}
