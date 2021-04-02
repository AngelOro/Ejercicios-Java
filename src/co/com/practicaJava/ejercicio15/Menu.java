package co.com.practicaJava.ejercicio15;

import java.util.Scanner;

public class Menu {

    Scanner entrada = new Scanner(System.in);

    public void menu(){
        System.out.println("**************GESTIÓN CINEMATOGRÁFICA***************" +
                "\n 1-NUEVO ACTOR" +
                "\n 2-BUSCAR ACTOR" +
                "\n 3-ELIMINAR ACTOR" +
                "\n 4-MODIFICAR ACTOR" +
                "\n 5-VER TODOS LOS ACTORES" +
                "\n 6-VER PELICULAS DE LOS ACTORES" +
                "\n 7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES" +
                "\n 8-SALIR");
    }

    public void mostrarMenu(int opcion){
        while (opcion != 8){
            switch (opcion){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    menu();
                    break;
                default:
                    System.out.println("----------Opción incorrecta-----------");
                    menu();
                    break;
            }
            opcion = nuevaOpcion();
        }
        System.exit(0);
    }

    public int nuevaOpcion(){
        System.out.println("Ingresa una opción del menú: ");
        return entrada.nextInt();
    }


}
