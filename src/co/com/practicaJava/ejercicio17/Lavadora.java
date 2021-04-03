package co.com.practicaJava.ejercicio17;

public class Lavadora extends Electrodomestico{

    private final static int cargaDefault = 5;

    private Integer carga;

    public Lavadora() {
        this(precioBaseDefault, colorDefault, consumoEnergicoDefault, pesoDefault, cargaDefault);
    }

    public Lavadora(Integer precioBase, Integer peso) {
        super(precioBase, peso);
        this.carga = cargaDefault;
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
