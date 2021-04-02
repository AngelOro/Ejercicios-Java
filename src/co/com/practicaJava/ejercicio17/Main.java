package co.com.practicaJava.ejercicio17;

public class Main {

    public static void main(String[] args) {

        Electrodomestico arrayElectrodomesticos[] = new Electrodomestico[10];

        arrayElectrodomesticos[0] = new Lavadora();
        arrayElectrodomesticos[1] = new Television();
        arrayElectrodomesticos[2] = new Television(150, 50);
        arrayElectrodomesticos[3] = new Lavadora(220,70);
        arrayElectrodomesticos[4] = new Lavadora(165, "verde", 'G', 76, 7);
        arrayElectrodomesticos[5] = new Television(200, "negro",'F',40,47,true);
        arrayElectrodomesticos[6] = new Lavadora(147,60);
        arrayElectrodomesticos[7] = new Television(170, 30);
        arrayElectrodomesticos[8] = new Television(159, "morado",'A',10,60,false);
        arrayElectrodomesticos[9] = new Electrodomestico(300,"rojo",'E',76);

        for (int i = 0; i < arrayElectrodomesticos.length; i++){
            System.out.println("Precio final para electrodomestico [" + i + "]: "+ arrayElectrodomesticos[i].precioFinal());
        }

        int precioLavadora = 0;
        int precioTelevision = 0;
        int precioElectrodomestico = 0;

        for (Electrodomestico objeto : arrayElectrodomesticos){
            if (objeto instanceof Lavadora){
                precioLavadora += objeto.precioFinal();
            }
            if (objeto instanceof Television){
                precioTelevision += objeto.precioFinal();
            }
            precioElectrodomestico += objeto.precioFinal();
        }

        System.out.println("\n Precio para Lavadoras: " + precioLavadora +
                "\n Precio para Televisores: " + precioTelevision +
                "\n Precio para Electrodomesticos: " + precioElectrodomestico);

    }
}
