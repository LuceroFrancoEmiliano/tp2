public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private double promedio;
    private Materia[] materias;
    private int contadorMaterias;

    //CONSTRUCTOR VACIO
    public Estudiante() {
    }

    //CONSTRUCTOR CON PARAMETROS
    public Estudiante(String nombre, String apellido, int edad, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);
        this.carrera = carrera;
        this.materias = new Materia[10]; 
        this.contadorMaterias = 0;
    }

    //NOMBRE
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if(!nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    //APELLIDO
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        if(!apellido.isEmpty()) {
            this.apellido = apellido;
        }
    }

    //EDAD
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if(edad >= 16){
            this.edad = edad;
        }
    }

    //CARRERA
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
            this.carrera = carrera;
    }

    //PROMEDIO
    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(double promedio) {
        if(promedio>=0 && promedio<=10) {
            this.promedio = promedio;
        }
    }

    //agregarMateria
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
    System.out.println("Materias de " + this.nombre + " " + this.apellido + ":");
    if (contadorMaterias == 0) {
        System.out.println("   (No tiene materias cargadas)");
    } else {
        for (int i = 0; i < contadorMaterias; i++) {
            System.out.println("   - " + materias[i].getNombre() + " [Nota: " + materias[i].getCalificacion() + "]");
        }
    }
}

}