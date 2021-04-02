package co.com.practicaJava.ejercicio12;

public class CompararPalabras {
    private String palabra1;
    private String palabra2;

    public CompararPalabras(String palabra1, String palabra2) {
        this.palabra1 = palabra1;
        this.palabra2 = palabra2;
    }

    public String iguales(){
        if(palabra1.equals(palabra2)){
            return "Son iguales";
        }
        return diferencias();
    }

    public String diferencias(){
        if(longitudDiferente()){
            return "Tienen distinta longitud: \n" + palabra1 + "--"+ palabra1.length()+"\n" + palabra2 + "--"+ palabra2.length();
        }
        diferenciaCaracter();
        return "Tienen misma longitud pero caracteres diferentes";
    }

    public boolean longitudDiferente(){
        return palabra1.length() != palabra2.length();
    }

    public void diferenciaCaracter(){
        for (int i = 0; i < palabra1.length(); i++){
            System.out.println("Caracter " + i + "  Pimera palabra:  " + palabra1.charAt(i)+ "  - Segunda palabra:  " + palabra2.charAt(i));
        }
    }

}
