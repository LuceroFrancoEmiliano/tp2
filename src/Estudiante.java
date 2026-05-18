public class Estudiante extends Persona implements MiembroUniversidad {
    private String carrera;
    private double promedio;
    private Materia[] materias;
    private int contadorMaterias;

    public Estudiante(String nombre, String apellido, int edad, String documento, String carrera) {
        super(nombre, apellido, edad, documento); 
        this.carrera = carrera;
        this.materias = new Materia[10];
        this.contadorMaterias = 0;
    }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public double getPromedio() { return promedio; }
    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 10) this.promedio = promedio;
    }

    public void agregarMateria(Materia materia) {
        if (contadorMaterias < materias.length) {
            this.materias[contadorMaterias] = materia;
            contadorMaterias++;
        } else {
            System.out.println("Límite de materias alcanzado.");
        }
    }

    public double calcularPromedio() {
        if (materias == null || materias.length == 0) return 0;
        double suma = 0;
        int materiasCargadas = 0;
        for (int i = 0; i < materias.length; i++) {
            if (materias[i] != null) {
                suma += materias[i].getCalificacion();
                materiasCargadas++;
            }
        }
        return (materiasCargadas == 0) ? 0 : suma / materiasCargadas;
    }

    public void mostrarMateriasInscriptas() {
        System.out.println("Materias de " + getNombre() + " " + getApellido() + ":");
        if (contadorMaterias == 0) {
            System.out.println("   (No tiene materias cargadas)");
        } else {
            for (int i = 0; i < contadorMaterias; i++) {
                System.out.println("   - " + materias[i].getNombre() + " [Nota: " + materias[i].getCalificacion() + "]");
            }
        }
    }

    @Override
    public String toString() {
        return "Estudiante: " + getNombre() + " " + getApellido() + ", Edad: " + getEdad() + ", Carrera: " + carrera + ", Promedio: " + promedio;
    }

    @Override
    public String obtenerRol() { return "Estudiante"; }

    @Override
    public String obtenerInformacionCompleta() { return toString(); }
}
