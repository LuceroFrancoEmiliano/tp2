import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Carrera ingenieria = new Carrera("Ingeniería en Sistemas", 10);
        int opcion;

        do {
            System.out.println("\n--- SISTEMA ACADÉMICO UNVIME ---");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Listar Estudiantes");
            System.out.println("3. Cargar Materia y Nota a Estudiante");
            System.out.println("4. Ver Promedios");
            System.out.println("5. Ver materias de cada alumno");
            System.out.println("6. Salir");
            System.out.print("Seleccione: ");
            opcion = leer.nextInt();
            leer.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: "); String n = leer.nextLine();
                    System.out.print("Apellido: "); String a = leer.nextLine();
                    System.out.print("Edad: "); int e = leer.nextInt();
                    ingenieria.agregarEstudiante(new Estudiante(n, a, e, ingenieria.getNombre()));
                    break;
                case 2:
                    ingenieria.mostrarEstudiantes();
                    break;
                case 3:
                    System.out.print("Nombre del estudiante: ");
                    String buscar = leer.nextLine();
                    Estudiante est = ingenieria.buscarEstudiante(buscar);
                    if (est != null) {
                        System.out.print("Materia: "); String matNombre = leer.nextLine();
                        System.out.print("Nota: "); double nota = leer.nextDouble();
                        est.agregarMateria(new Materia(matNombre, "COD", 4, nota));
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("PROMEDIOS:");
                    for (int i = 0; i < ingenieria.getContador(); i++) {
                        Estudiante alumno = ingenieria.getEstudiantes()[i];
                        System.out.println(alumno.getNombre() + ": " + alumno.calcularPromedio());
                    }
                    break;
                case 5:
                    System.out.println("\n=== DETALLE DE ALUMNOS Y MATERIAS ===");
                    if (ingenieria.getContador() == 0) {
                        System.out.println("No hay alumnos registrados.");
                    } else {
                        for (int i = 0; i < ingenieria.getContador(); i++) {
                            Estudiante alumno = ingenieria.getEstudiantes()[i];
                            alumno.mostrarMateriasInscriptas();
                            System.out.println("-----------------------");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");

            }
        } while (opcion != 5);
        leer.close();
    }
}