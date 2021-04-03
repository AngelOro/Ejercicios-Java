package co.com.practicaJava.ejercicio17;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Electrodomestico {

    protected final static Integer precioBaseDefault = 100;
    protected final static String colorDefault = "blanco";
    protected final static Character consumoEnergicoDefault = 'F';
    protected final static Integer pesoDefault = 5;

    protected Integer precioBase;
    protected String color;
    protected Character consumoEnergico;
    protected Integer peso;

    public Electrodomestico() {
        this(precioBaseDefault, colorDefault, consumoEnergicoDefault, pesoDefault);
    }

    public Electrodomestico(Integer precioBase, Integer peso) {
        this(precioBase, colorDefault, consumoEnergicoDefault, peso);
    }

    public Electrodomestico(Integer precioBase, String color, Character consumoEnergico, Integer peso) {
        this.precioBase = precioBase;
        this.color = comprobarColor(color);
        this.consumoEnergico = comprobarConsumoEnergetico(consumoEnergico);
        this.peso = peso;
    }

    public Integer getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public Character getConsumoEnergico() {
        return consumoEnergico;
    }

    public Integer getPeso() {
        return peso;
    }

    private char comprobarConsumoEnergetico(char letra){
        List<Character> consumo = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F');
        if (consumo.contains(letra)){
            return letra;
        }
        return consumoEnergicoDefault;
    }

    private String comprobarColor(String color){
        List<String> colores = Arrays.asList("blanco", "negro", "rojo", "azul", "gris");
        if (colores.contains(color.toLowerCase(Locale.ROOT))){
            return color;
        }
        return colorDefault;
    }

    public int precioFinal(){
        return precioBase + calcularConsumo(consumoEnergico) + consumoPeso(peso);
    }

    public int calcularConsumo(char letra){
        switch (letra){
            case 'A':
                return 100;
            case 'B':
                return 80;
            case 'C':
                return 60;
            case 'D':
                return 50;
            case 'E':
                return 30;
            default:
                return 10;
        }
    }

    public int consumoPeso(int peso){
        int consumo;
        if (peso < 20){
            consumo = 10;
        }else if(peso > 19 && peso < 50){
            consumo = 50;
        }else if(peso > 49 && peso < 80){
            consumo = 80;
        }else {
            consumo = 100;
        }
        return consumo;
    }
}
