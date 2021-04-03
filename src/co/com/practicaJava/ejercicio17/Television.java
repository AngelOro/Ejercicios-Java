package co.com.practicaJava.ejercicio17;

public class Television extends Electrodomestico {

    private final static int resolusionDefault = 20;
    private final static boolean TDTDefault = false;

    private int resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        this(precioBaseDefault, colorDefault, consumoEnergicoDefault, pesoDefault, resolusionDefault, TDTDefault);
    }

    public Television(Integer precioBase, Integer peso) {
        super(precioBase, peso);
        this.resolucion = resolusionDefault;
        this.sintonizadorTDT = TDTDefault;
    }

    public Television(Integer precioBase, String color, Character consumoEnergico, Integer peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public int precioFinal() {
        int precio = super.precioFinal();
        if (resolucion > 40){
            precio += this.getPrecioBase()*0.3;
        }
        if (sintonizadorTDT){
            precio += 50;
        }
        return precio;
    }
}
