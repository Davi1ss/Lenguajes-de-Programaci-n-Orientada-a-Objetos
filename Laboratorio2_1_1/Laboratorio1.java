/******************************************************************************

Laboratorio 1

*******************************************************************************/
import java.util.Scanner;

public class Laboratorio1 {
    public static void main(String[] args) {
        // Crear un arreglo para almacenar los objetos Estudiante
        
        Estudiante[] estudiantes = new Estudiante[3];
        try (Scanner scanner = new Scanner(System.in)){
        

        // Capturar los datos del profesor
        System.out.println("Ingrese los datos del profesor:");
        System.out.print("Nombre del profesor: ");
        String nombreProfesor = scanner.nextLine();

        System.out.print("Número de empleado del profesor: ");
        String numeroEmpleadoProfesor = scanner.nextLine();

        System.out.print("Grado del profesor (Licenciado, Maestría, Doctorado): ");
        String gradoProfesor = scanner.nextLine();

        System.out.print("Email del profesor: ");
        String emailProfesor = scanner.nextLine();

        // Crear un objeto Profesor con los datos capturados
        Profesor profesor = new Profesor(nombreProfesor, numeroEmpleadoProfesor, gradoProfesor, emailProfesor);

        // Capturar los datos de los cinco estudiantes
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("\nIngrese los datos del estudiante " + (i + 1) + ":");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Matrícula: ");
            String matricula = scanner.nextLine();

            System.out.print("Promedio: ");
            double promedio = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea después de leer el promedio

            System.out.print("Email: ");
            String email = scanner.nextLine();

            // Crear un objeto Estudiante con los datos capturados
            estudiantes[i] = new Estudiante(nombre, matricula, promedio, email);
        }

        // Capturar los datos de la materia
        System.out.println("\nIngrese los datos de la materia:");
        System.out.print("Nombre de la materia: ");
        String nombreMateria = scanner.nextLine();

        System.out.print("Clave de la materia: ");
        String claveMateria = scanner.nextLine();

        int creditosMateria;
        do {
            System.out.print("Número de créditos de la materia: ");
            creditosMateria = scanner.nextInt();
        } while (creditosMateria < 1 || creditosMateria > 7);

        // Crear un objeto Materia con los datos capturados
        Materia materia = new Materia(nombreMateria, claveMateria, creditosMateria);

        // Menú para elegir entre mostrar los datos del profesor, de los estudiantes o de la materia
        System.out.println("\nMenú:");
        System.out.println("1. Mostrar datos del profesor");
        System.out.println("2. Mostrar datos de los estudiantes");
        System.out.println("3. Mostrar datos de la materia");
        System.out.println("4. Mostrar datos de toda la clase");
        System.out.print("Elija una opción (1, 2, 3 o 4): ");
        int opcion = scanner.nextInt();

        // Mostrar los datos según la opción elegida
        switch (opcion) {
            case 1:
                mostrarDatosProfesor(profesor);
                break;
            case 2:
                mostrarDatosEstudiantes(estudiantes);
                break;
            case 3:
                mostrarDatosMateria(materia);
                break;
            case 4:
                mostrarDatosProfesor(profesor);
                mostrarDatosEstudiantes(estudiantes);
                mostrarDatosMateria(materia);
                break;
                
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
    }

    // Función para mostrar los datos del profesor
    private static void mostrarDatosProfesor(Profesor profesor) {
        System.out.println("\nDatos del profesor:");
        System.out.println("Nombre: " + profesor.getNombre());
        System.out.println("Número de empleado: " + profesor.getNumeroEmpleado());
        System.out.println("Grado: " + profesor.getGrado());
        System.out.println("Email: " + profesor.getEmail());
    }

    // Función para mostrar los datos de los estudiantes
    private static void mostrarDatosEstudiantes(Estudiante[] estudiantes) {
        System.out.println("\nDatos de los estudiantes:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("\nEstudiante " + (i + 1) + ":");
            System.out.println("Nombre: " + estudiantes[i].getNombre());
            System.out.println("Matrícula: " + estudiantes[i].getMatricula());
            System.out.println("Promedio: " + estudiantes[i].getPromedio());
            System.out.println("Email: " + estudiantes[i].getEmail());
        }
    }

    // Función para mostrar los datos de la materia
    private static void mostrarDatosMateria(Materia materia) {
        System.out.println("\nDatos de la materia:");
        System.out.println("Nombre: " + materia.getNombre());
        System.out.println("Clave: " + materia.getClave());
        System.out.println("Número de créditos: " + materia.getCreditos());
    }
}

class Profesor {
    private String nombre;
    private String numeroEmpleado;
    private String grado;
    private String email;

    // Constructor
    public Profesor(String nombre, String numeroEmpleado, String grado, String email) {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.grado = grado;
        this.email = email;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public String getGrado() {
        return grado;
    }

    public String getEmail() {
        return email;
    }
}

class Estudiante {
    private String nombre;
    private String matricula;
    private double promedio;
    private String email;

    // Constructor
    public Estudiante(String nombre, String matricula, double promedio, String email) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
        this.email = email;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getPromedio() {
        return promedio;
    }

    public String getEmail() {
        return email;
    }
}

class Materia {
    private String nombre;
    private String clave;
    private int creditos;

    // Constructor
    public Materia(String nombre, String clave, int creditos) {
        this.nombre = nombre;
        this.clave = clave;
        this.creditos = creditos;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }
    
    public int getCreditos() {
        return creditos;
    }
    
}