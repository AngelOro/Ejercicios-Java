package co.com.practicaJava.ejercicio13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FechaHora {

    /*
    * Fecha y hora actual (AAAA/MM/DD)(HH:MM:SS)
    * */
    public static void main(String[] args) {

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Fecha y hora actua: " + dateFormat.format(LocalDateTime.now()));
    }
}
