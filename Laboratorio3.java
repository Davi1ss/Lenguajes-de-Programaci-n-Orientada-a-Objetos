import java.util.Scanner;
//atributos de la persona
public class Laboratorio3 {
    // Atributos demográficos
    private String nombre;  // Private
    protected int edad;     // Protected
    private String genero;
    private String direccion; 
    private String ocupacion;

    // Constructor de persona
    public Laboratorio3(String nombre, int edad, String genero, String direccion, String ocupacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
        this.ocupacion = ocupacion;
    }

    // Métodos
    public void comer(String comida) {
        System.out.println(nombre + " está comiendo " + comida);
    }

    protected void dormir(int horas) {
        System.out.println(nombre + " duerme en promedio " + horas + " horas");
    }

    private void tomarShower() {
        System.out.println(nombre + " está tomando una ducha");
    }

    public void realizarTomarShower() {
        tomarShower();
    }

    // Método para imprimir datos
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Dirección: " + direccion);
        System.out.println("Ocupación: " + ocupacion);
    }

    public static void main(String[] args) {
        // Crear objeto Persona
        try (Scanner scanner = new Scanner(System.in)){

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el género: ");
        String genero = scanner.nextLine();

        System.out.print("Ingrese la dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Ingrese la ocupación: ");
        String ocupacion = scanner.nextLine();

        Laboratorio3 persona1 = new Laboratorio3(nombre, edad, genero, direccion, ocupacion);

        // Mostrar valores de atributos
        persona1.imprimirDatos();

        // Invocar métodos
        persona1.comer("Pizza");
        persona1.dormir(7);
        // persona1.tomarShower(); // Este método no puede ser invocado directamente desde aquí
        persona1.realizarTomarShower();
        }
    }
}