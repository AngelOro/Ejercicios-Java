package co.com.practicaJava.ejercicio16;


public class Persona {

    private String nombre = "";
    private Integer edad = 0;
    private String DNI = generaDNI();
    private Character sexo = 'H';
    private Integer peso = 0;
    private Double altura = 0.0;
    private Integer valorIMC = 0;

    public Persona() {
    }

    public Persona(String nombre, Integer edad, Character sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
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

    public int debajoPesoIdeal(){
        if (calcularIMC() < 20){
            valorIMC = -1;
        }
        return valorIMC;
    }

    public int encimaPesoIdeal(){
        if (calcularIMC() > 25){
            valorIMC = 1;
        }
        return valorIMC;
    }

    public String asignarIMC(){
        String mensajeIMC;
        if (encimaPesoIdeal() == 1) {
            mensajeIMC = "Está con sobre peso";
        }else if(debajoPesoIdeal() == -1) {
            mensajeIMC = "Está por debajo del peso ideal";
        }else {
            mensajeIMC = "Está con el peso ideal";
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
                ", valorIMC=" + valorIMC +
                '}';
    }
}
