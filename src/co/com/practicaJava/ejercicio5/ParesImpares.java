package co.com.practicaJava.ejercicio5;

public class ParesImpares {

    private int numero = 1;

    public void par(){
        while (numero <= 1000){
            if (esPar()){
                System.out.println(numero);
            }
            numero++;
        }
    }

    public void impar(){
        while (numero <= 1000){
            if (!esPar()){
                System.out.println(numero);
            }
            numero++;
        }
    }

    public boolean esPar(){
        return numero % 2 == 0;
    }
}
