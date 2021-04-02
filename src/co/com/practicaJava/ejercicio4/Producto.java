package co.com.practicaJava.ejercicio4;

public class Producto {
    private Double precio;
    private final Double iva = 0.21;


    public Producto(Double precio) {
        this.precio = precio;
    }

    public double precioFinal(){
        return importeIva() + precio;
    }

    public double importeIva(){
        return precio * iva;
    }
}
