package co.com.practicaJava.ejercicio6;

public class ForParesImpares {

    public void par(){
        for (int i = 1; i <= 1000; i++){
            if (esPar(i)){
                System.out.println(i);
            }
        }
    }

    public void impar(){
        for (int i = 1; i <= 1000; i++){
            if (!esPar(i)){
                System.out.println(i);
            }
        }
    }

    public boolean esPar(int numero){
        return numero % 2 == 0;
    }
}
