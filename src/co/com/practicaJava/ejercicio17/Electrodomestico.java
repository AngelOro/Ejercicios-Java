package co.com.practicaJava.ejercicio17;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Electrodomestico {

    private Integer precioBase = 100;
    private String color = "blanco";
    private Character consumoEnergico = 'F';
    private Integer peso = 5;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.peso = peso;
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
        List<Character> consumo = Arrays.asList(new Character[]{'A', 'B', 'C', 'D', 'E', 'F'});
        if (consumo.contains(letra)){
            return letra;
        }
        return 'F';
    }

    private String comprobarColor(String color){
        List<String> colores = Arrays.asList(new String[]{"blanco", "negro", "rojo", "azul", "gris"});
        if (colores.contains(color.toLowerCase(Locale.ROOT))){
            return color;
        }
        return "blanco";
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
            consumo = 30;
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
