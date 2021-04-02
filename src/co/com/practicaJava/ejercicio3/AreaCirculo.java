package co.com.practicaJava.ejercicio3;

import java.util.Scanner;

public class AreaCirculo {
    /*
    * 3. Calcular el área de un círculo(π * r^2)
    * */
    public static void main(String[] args) {

        final double pi =  Math.PI;
        double radio;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el radio del círculo: ");
        radio = entrada.nextDouble();

        System.out.println("Area del círculo: " + areaCirculo(pi, radio));
    }

    public static double areaCirculo(double pi, double radio){
        return pi * Math.pow(radio, 2);
    }
}

