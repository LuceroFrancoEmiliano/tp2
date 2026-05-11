import java.util.Scanner;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Universidad unvime = new Universidad("UNViMe", "Villa Mercedes", new Estudiante[100]);
        Carrera ingenieria = new Carrera("Ingeniería en Sistemas", 10);
        
        int opcion;

        do {
            System.out.println("\n--- SISTEMA ACADÉMICO INTEGRAL ---");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Registrar Profesor");
            System.out.println("3. Registrar Personal Administrativo");
            System.out.println("4. Asignar Materia a Estudiante y Profesor");
            System.out.println("5. Listar todos los Miembros (Roles)");
            System.out.println("6. Ver Estudiantes por Carrera");
            System.out.println("7. Salir");
            System.out.print("Seleccione: ");
            opcion = leer.nextInt();
            leer.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: "); String nomE = leer.nextLine();
                    System.out.print("Apellido: "); String apeE = leer.nextLine();
                    System.out.print("Documento: "); String docE = leer.nextLine();
                    Estudiante nuevoEst = new Estudiante(nomE, apeE, 20, docE, ingenieria.getNombre());
                    ingenieria.agregarEstudiante(nuevoEst);
                    unvime.agregarMiembro(nuevoEst);
                    System.out.println("Estudiante registrado.");
                    break;

                case 2:
                    System.out.print("Nombre: "); String nomP = leer.nextLine();
                    System.out.print("Especialidad: "); String esp = leer.nextLine();
                    System.out.print("Documento: "); String docP = leer.nextLine();
                    Profesor nuevoProf = new Profesor(nomP, "Apellido", 40, docP, esp, 10);
                    unvime.agregarMiembro(nuevoProf);
                    System.out.println("Profesor registrado en la universidad.");
                    break;

                case 3:
                    System.out.print("Nombre: "); String nomAd = leer.nextLine();
                    System.out.print("Puesto: "); String puesto = leer.nextLine();
                    System.out.print("Documento: "); String docAd = leer.nextLine();
                    Personal nuevoPers = new Personal(nomAd, "Apellido", 35, docAd, "Administración", puesto, LocalDate.now());
                    unvime.agregarMiembro(nuevoPers);
                    System.out.println("Personal registrado.");
                    break;

                case 4:
                    System.out.print("Nombre de la Materia: "); String matNombre = leer.nextLine();
                    System.out.print("Documento del Profesor: "); String docBusqP = leer.nextLine();
                    System.out.println("Funcionalidad: Se crea la materia y se vincula al profesor objeto.");
                    break;

                case 5:
                    System.out.println("\n--- MIEMBROS DE LA UNIVERSIDAD ---");
                    unvime.mostrarMiembros();
                    break;

                case 6:
                    ingenieria.mostrarEstudiantes();
                    break;

                case 7:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 7);
        leer.close();
    }
}
