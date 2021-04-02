package co.com.practicaJava.ejercicio4;

import java.util.Scanner;

public class PrecioProducto {
    /*
    * 4. Pedir el precio de un producto y calcular el precio final con IVA
    * */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el precio del producto: ");
        Producto precio = new Producto(entrada.nextDouble());

        System.out.println("Precio final: " + precio.precioFinal());
    }

}
