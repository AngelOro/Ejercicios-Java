package co.com.practicaJava.ejercicio16;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String nombre;
        Integer edad;
        Character sexo;
        int peso;
        double altura;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingresa la edad: ");
        edad = entrada.nextInt();
        System.out.println("Ingresa el sexo -> H: hombre o M: mujer");
        sexo = entrada.next().charAt(0);
        System.out.println("Ingresa el peso: ");
        peso = entrada.nextInt();
        System.out.println("Ingresa la altura: ");
        altura = entrada.nextDouble();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        persona3.setNombre("fulanito");
        persona3.setEdad(10);
        persona3.setSexo('m');
        persona3.setPeso(40);
        persona3.setAltura(1.59);
        persona3.comprobarSexo('m');

        System.out.println("IMC persona 1: " + persona1.asignarIMC());
        System.out.println("IMC persona 2: " + persona2.asignarIMC());
        System.out.println("IMC persona 3: " + persona3.asignarIMC());

        System.out.println("Persona 1 es mayor de edad: " + persona1.esMayorDeEdad());
        System.out.println("Persona 2 es mayor de edad: " + persona2.esMayorDeEdad());
        System.out.println("Persona 3 es mayor de edad: " + persona3.esMayorDeEdad());

        System.out.println("\n Información persona 1:" + persona1.toString());
        System.out.println("\n Información persona 2:" + persona2.toString());
        System.out.println("\n Información persona 3:" + persona3.toString());

    }
}
