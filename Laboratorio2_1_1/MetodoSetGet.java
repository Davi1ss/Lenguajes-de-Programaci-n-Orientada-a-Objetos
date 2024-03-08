import java.util.Scanner;

public class MetodoSetGet {
    public static void main(String[] args) {
        // Crear un arreglo para almacenar los objetos Estudiante
        Estudiante[] estudiantes = new Estudiante[3];
        try (Scanner scanner = new Scanner(System.in)) {

            // Capturar los datos del profesor
            System.out.println("Ingrese los datos del profesor:");
            Profesor profesor = new Profesor();
            profesor.setGet("Nombre del profesor: ", "nombre", scanner);
            profesor.setGet("Número de empleado del profesor: ", "numeroEmpleado", scanner);
            profesor.setGet("Grado del profesor (Licenciado, Maestría, Doctorado): ", "grado", scanner);
            profesor.setGet("Email del profesor: ", "email", scanner);

            // Capturar los datos de los cinco estudiantes
            for (int i = 0; i < estudiantes.length; i++) {
                System.out.println("\nIngrese los datos del estudiante " + (i + 1) + ":");
                estudiantes[i] = new Estudiante();
                estudiantes[i].setGet("Nombre: ", "nombre", scanner);
                estudiantes[i].setGet("Matrícula: ", "matricula", scanner);
                estudiantes[i].setGet("Promedio: ", "promedio", scanner);
                estudiantes[i].setGet("Email: ", "email", scanner);
            }

            // Capturar los datos de la materia
            System.out.println("\nIngrese los datos de la materia:");
            Materia materia = new Materia();
            materia.setGet("Nombre de la materia: ", "nombre", scanner);
            materia.setGet("Clave de la materia: ", "clave", scanner);
            materia.setGet("Número de créditos de la materia: ", "creditos", scanner);

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
        profesor.imprimirDatos();
    }

    // Función para mostrar los datos de los estudiantes
    private static void mostrarDatosEstudiantes(Estudiante[] estudiantes) {
        System.out.println("\nDatos de los estudiantes:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("\nEstudiante " + (i + 1) + ":");
            estudiantes[i].imprimirDatos();
        }
    }

    // Función para mostrar los datos de la materia
    private static void mostrarDatosMateria(Materia materia) {
        System.out.println("\nDatos de la materia:");
        materia.imprimirDatos();
    }
}

class Profesor {
    private String nombre;
    private String numeroEmpleado;
    private String grado;
    private String email;

    // Método setGet
    public void setGet(String mensaje, String atributo, Scanner scanner) {
        System.out.print(mensaje);
        switch (atributo) {
            case "nombre":
                this.nombre = scanner.nextLine();
                break;
            case "numeroEmpleado":
                this.numeroEmpleado = scanner.nextLine();
                break;
            case "grado":
                this.grado = scanner.nextLine();
                break;
            case "email":
                this.email = scanner.nextLine();
                break;
        }
    }

    // Método para imprimir datos
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Número de empleado: " + numeroEmpleado);
        System.out.println("Grado: " + grado);
        System.out.println("Email: " + email);
    }
}

class Estudiante {
    private String nombre;
    private String matricula;
    private double promedio;
    private String email;

    // Método setGet
    public void setGet(String mensaje, String atributo, Scanner scanner) {
        System.out.print(mensaje);
        switch (atributo) {
            case "nombre":
                this.nombre = scanner.nextLine();
                break;
            case "matricula":
                this.matricula = scanner.nextLine();
                break;
            case "promedio":
                this.promedio = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea después de leer el promedio
                break;
            case "email":
                this.email = scanner.nextLine();
                break;
        }
    }

    // Método para imprimir datos
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Promedio: " + promedio);
        System.out.println("Email: " + email);
    }
}

class Materia {
    private String nombre;
    private String clave;
    private int creditos;

    // Método setGet
    public void setGet(String mensaje, String atributo, Scanner scanner) {
        System.out.print(mensaje);
        switch (atributo) {
            case "nombre":
                this.nombre = scanner.nextLine();
                break;
            case "clave":
                this.clave = scanner.nextLine();
                break;
            case "creditos":
                this.creditos = scanner.nextInt();
                break;
        }
    }

    // Método para imprimir datos
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Clave: " + clave);
        System.out.println("Número de créditos: " + creditos);
    }
}

/*Pros:
Reutilización de código: El método setGet permite reutilizar la lógica para ingresar y mostrar valores, lo que puede reducir la redundancia en tu código.

Facilita la lectura del código: Al centralizar la lógica de entrada y salida en un solo lugar, el código principal puede ser más claro y conciso.

Contras:
Acoplamiento: Este enfoque acopla la lógica de entrada/salida con la lógica de la clase Estudiante.
Esto puede ser un problema si necesitas cambiar la forma en que ingresan o muestran datos, ya que tendrías que actualizar todas las llamadas a setGet.

Menos control sobre la entrada: El método setGet asume que siempre se ingresará un valor válido, sin mucha validación.
Puedes agregar más validaciones según tus necesidades, pero esto podría hacer que el método sea más complejo.

En última instancia, la elección de utilizar un método setGet o no dependerá de tus preferencias y de la complejidad del programa.
Puedes optar por esta versión si la reutilización y la simplicidad son tus principales preocupaciones, pero también debes estar consciente de los posibles inconvenientes mencionados. */