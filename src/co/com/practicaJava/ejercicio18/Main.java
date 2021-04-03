package co.com.practicaJava.ejercicio18;

public class Main {
    public static void main(String[] args) {

        //Creamos dos arrays de cada tipo de objeto
        Serie listaSeries[] = new Serie[5];
        Videojuego listaVideojuegos[] = new Videojuego[5];

        //Creamos un objeto en cada posicion del array
        listaSeries[0]=new Serie();
        listaSeries[1]=new Serie("Gambito de Dama", "Scott Frank");
        listaSeries[2]=new Serie("Outlander", 5, "Drama", "Ronald D. Moore");
        listaSeries[3]=new Serie("Vikingos", 6 ,"Guerra", "Michael Hirst");
        listaSeries[4]=new Serie("The Walking Dead", 10, "Horror", "Frank Darabont");

        listaVideojuegos[0]=new Videojuego();
        listaVideojuegos[1]=new Videojuego("Call of Duty", 5, "Disparos", " Activision");
        listaVideojuegos[2]=new Videojuego("Leagues of Lengends", "Riot Games");
        listaVideojuegos[3]=new Videojuego("Pac-Man", 15, "Arcade", "Toru Iwatani");
        listaVideojuegos[4]=new Videojuego("Tomb Raider", 120, "Accion-Aventura", "Square Enix");

        //entregamos algunos videojuegos y series
        listaSeries[2].entregar();
        listaSeries[3].entregar();
        listaSeries[1].entregar();
        listaVideojuegos[1].entregar();
        listaVideojuegos[2].entregar();
        listaVideojuegos[0].entregar();

        System.out.println("******************************************");
        System.out.println("\nHay "+seriesEntregadas(listaSeries)+" series entregadas");
        System.out.println("\nHay "+videojuegosEntregados(listaVideojuegos)+" videojuegos entregadas");

        System.out.println("******************************************");
        //Mostramos toda la informacion del videojuego y serie mayor
        System.out.println("\nSerie con más temporadas: \n" + serieMayorTemporadas(listaSeries));
        System.out.println("\nVideojuego con más horas estimadas: \n" + videojuegoMayorHoras(listaVideojuegos));
    }

    //Recorremos los arrays para contar cuantos entregados hay, tambien los devolvemos
    public static int seriesEntregadas(Serie listaSeries[]){
        int entregados = 0;
        for(int i = 0; i < listaSeries.length; i++){
            if(listaSeries[i].isEntregado()){
                entregados+=1;
                listaSeries[i].devolver();
            }
        }
        return entregados;
    }

    public static int videojuegosEntregados(Videojuego listaVideojuegos[]){
        int entregados = 0;
        for(int i = 0; i < listaVideojuegos.length; i++){
            if(listaVideojuegos[i].isEntregado()){
                entregados+=1;
                listaVideojuegos[i].devolver();
            }
        }
        return entregados;
    }

    //Recorremos el array desde la posicion 1 (no 0), comparando el mayor con las posiciones del array
    public static Serie serieMayorTemporadas(Serie listaSeries[]){
        Serie mayorTemporadas = listaSeries[0];
        for(int i = 1; i < listaSeries.length; i++){
            if(listaSeries[i].compareTo(mayorTemporadas) == 1){
                mayorTemporadas = listaSeries[i];
            }
        }
        return mayorTemporadas;
    }

    public static Videojuego videojuegoMayorHoras(Videojuego listaVideojuegos[]){
        Videojuego mayorHorasEstimadas = listaVideojuegos[0];
        for(int i = 1; i < listaVideojuegos.length;i++){
            if(listaVideojuegos[i].compareTo(mayorHorasEstimadas) == 1){
                mayorHorasEstimadas = listaVideojuegos[i];
            }
        }
        return mayorHorasEstimadas;
    }
}
