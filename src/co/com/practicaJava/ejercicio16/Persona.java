package co.com.practicaJava.ejercicio16;


public class Persona {

    //Constantes
    private final static char sexoDefault = 'H';
    public static final int bajoPeso = -1;
    public static final int pesoIdeal = 0;
    public static final int sobrepeso = 1;

    private String nombre;
    private Integer edad ;
    private String DNI;
    private Character sexo;
    private Integer peso;
    private Double altura;

    public Persona() {
        this("Fulanito", 12, sexoDefault, 40, 1.48);
    }

    public Persona(String nombre, Integer edad, Character sexo) {
        this(nombre, edad, sexo, 0, 0.0);
    }

    public Persona(String nombre, Integer edad, Character sexo, Integer peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public double calcularIMC(){
        return peso /(Math.pow(altura,2));
    }

    public boolean debajoPesoIdeal(){
        return calcularIMC() < 20;
    }

    public boolean encimaPesoIdeal(){
        return calcularIMC() > 25;
    }

    public String asignarIMC(){
        String mensajeIMC;
        if (encimaPesoIdeal()) {
            mensajeIMC = "IMC: " + sobrepeso + " -> Está con sobre peso";
        }else if(debajoPesoIdeal()) {
            mensajeIMC = "IMC: " + bajoPeso +" -> Está por debajo del peso ideal";
        }else {
            mensajeIMC = "IMC: " + pesoIdeal +" -> Está con el peso ideal";
        }
        return mensajeIMC;
    }

    public boolean esMayorDeEdad(){
        return edad >= 18;
    }

    public void comprobarSexo(char sexo){
        if (sexo != 'H' && sexo != 'M'){
            this.sexo = 'H';
        }
    }

    private String generaDNI(){
        int numeroId = (int)(100000000 * Math.random());
        char letra = letraDNI(numeroId);
        return Integer.toString(numeroId) + letra;
    }

    public char letraDNI(int numero){
        String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = numero%23;
        return caracteres.charAt(resto);
    }

    @Override
    public String toString() {
        return "\nPersona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
