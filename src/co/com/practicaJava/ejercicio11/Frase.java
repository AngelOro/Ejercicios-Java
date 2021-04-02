package co.com.practicaJava.ejercicio11;

public class Frase {

    private String frase;
    private final char[] vocales = {'a','e','i','o','u'};
    private int[] cantVocales = {0,0,0,0,0};

    public Frase(String frase) {
        this.frase = frase;
    }

    public void logitudFrase(){
        System.out.println("Longitud de la frase " + frase.length());
        recorrerFrase();
    }

    public void recorrerFrase(){
        for (int i = 0; i < frase.length(); i++){
            for (int j = 0; j < vocales.length; j++){
                if (frase.charAt(i) == vocales[j]){
                    cantVocales[j] ++;
                }
            }
        }

    }

    public void totalVocales(){
        System.out.println("Cantidad de vocales de \n a: " + cantVocales[0] + "\n e: " + cantVocales[1] +
                "\n i: " + cantVocales[2] +
                "\n o: " + cantVocales[3] +
                "\n u: " + cantVocales[4]);
    }

}
