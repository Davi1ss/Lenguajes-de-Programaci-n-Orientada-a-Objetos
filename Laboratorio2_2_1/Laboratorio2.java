package Laboratorio2_2_1;
class Persona {
    //Atributos demograficos
    private String nombre;
    protected int edad;
    private String genero;
    private String direccion;
    private String ocupacion;

    //Constructor
    public Persona(String nombre, int edad, String genero, String direccion, String ocupacion) {
        this.nombre = nombre; //setNombre(nombre);
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
    }
    //Setters y getters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    protected void setGenero(String genero) {
        this.genero = genero;
    }
    public String getGenero() {
        return genero;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }
    public String getOcupacion() {
        return ocupacion;
    }
    protected void dormir(int horas){
        System.out.println("Duermo en promedio " + horas + " horas");
    }
    public void comer(String comida) {
        System.out.println("Estoy comiendo " + comida );
    }
    public void ejercicio(String ejercicio) {
        System.out.println("En promedio hago 30 " + ejercicio + " al dia");
    }
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Direccion: " + direccion);
        System.out.println("Ocupacion: " + ocupacion);
    }
    
}

public class Laboratorio2 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Steven", 21, "masculino", "Rosarito", "Estudiante");
        persona1.setGenero("masculino");
        persona1.comer("Enchiladas");
        persona1.dormir(8);
        persona1.ejercicio("Burpees");
        persona1.imprimirDatos();
    }
}
