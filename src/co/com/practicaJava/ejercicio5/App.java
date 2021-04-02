package co.com.practicaJava.ejercicio5;

public class App {

    /*
     * 5. Muestra los números impares y pares del 1 al 1000, con ciclo while.
     * */
    public static void main(String[] args) {

        ParesImpares numerosPares = new ParesImpares();
        ParesImpares numerosImpares = new ParesImpares();

        System.out.println("\nNúmeros pares: ");
        numerosPares.par();
        System.out.println("\nNúmeros impares: ");
        numerosImpares.impar();

    }
}
