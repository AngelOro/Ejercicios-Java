package co.com.practicaJava.ejercicio17;

public class Lavadora extends Electrodomestico{

    private Integer carga = 5;

    public Lavadora() {
    }

    public Lavadora(Integer precioBase, Integer peso) {
        super(precioBase, peso);
    }

    public Lavadora(Integer precioBase, String color, Character consumoEnergico, Integer peso, Integer carga) {
        super(precioBase, color, consumoEnergico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    @Override
    public int precioFinal() {
        int precio = super.precioFinal();
        if (carga > 30){
            precio += 50;
        }
        return precio;
    }
}
