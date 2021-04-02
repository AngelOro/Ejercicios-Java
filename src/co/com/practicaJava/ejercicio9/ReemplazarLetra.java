package co.com.practicaJava.ejercicio9;

import java.util.Scanner;

public class ReemplazarLetra {

    /*
    * 9. De la frase "la sonrisa sera el mejor arma contra la tristeza"
    * Reemplazar la letra 'a' por la 'e' y concatenar otra frase
    * */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String frase = "la sonrisa sera el mejor arma contra la tristeza";
        String nuevaFrase;

        System.out.println("Frase original: \n" + frase + "\nIngresa una frase:  ");
        nuevaFrase = entrada.nextLine();
        System.out.println("Frase resultante: \n" + reemplazo(frase).concat(" " + nuevaFrase));



    }

    public static String reemplazo(String frase){
        return frase.replace('a', 'e');
    }
}
