package co.com.practicaJava.ejercicio15;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Menu menu = new Menu();
        Scanner entrada = new Scanner(System.in);

        menu.menu();
        System.out.println("Ingresa una opción del menú:");
        menu.mostrarMenu(entrada.nextInt());
    }
}
