package co.com.practicaJava.ejercicio10;

import java.util.Scanner;

public class EliminarEspacios {
    /*
    * 10. Pedir una frase y eliminar los espacios
    * */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase = entrada.nextLine();
        System.out.println("Frase resultante: \n" + eliminarEspacios(frase));

    }

    public static String eliminarEspacios(String frase){
        return frase.replace(" ", "");
    }
}
