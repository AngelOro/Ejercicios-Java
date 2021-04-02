package co.com.practicaJava.ejercicio11;

import java.util.Locale;
import java.util.Scanner;

public class App {

    /*
    * 11. Pasar una frase por consola e indicar la longitud de la frrase y la cantidad de vocales "a,e,i,o,u"
    * */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa una frase: ");
        Frase frase = new Frase(entrada.nextLine().toLowerCase(Locale.ROOT));

        frase.logitudFrase();
        frase.totalVocales();

    }
}
