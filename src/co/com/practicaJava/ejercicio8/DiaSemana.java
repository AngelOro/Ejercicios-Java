package co.com.practicaJava.ejercicio8;

import java.util.Scanner;

public class DiaSemana {
    /*
    * 8. Pedir un día de la semana y decir si es laboral o no
    * */


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String dia;

        System.out.println("\nIngresa el día de la semana: ");
        dia = entrada.nextLine().toLowerCase();
        System.out.println(diaSemana(dia));

    }

    public static String diaSemana(String dia){
        switch (dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                return "Día laboral";
            case "sabado":
            case "domingo":
               return "Día no laboral";
            default:
                return "No es un día valido";
        }
    }

}
