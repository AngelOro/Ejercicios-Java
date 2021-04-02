package co.com.practicaJava.ejercicio17;

public class Television extends Electrodomestico {

    private int resolucion = 20;
    private boolean sintonizadorTDT = false;

    public Television() {
    }

    public Television(Integer precioBase, Integer peso) {
        super(precioBase, peso);
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
            precio += aumentarPrecio(precio);
        }
        if (sintonizadorTDT){
            precio += 50;
        }
        return precio;
    }

    public int aumentarPrecio(int precio){
        return (precio/100)*130;
    }
}
