public class Carrera {
    private String nombre;
    private int cantidadAlumnos;
    private Estudiante[] estudiantes;
    private int contador;

    public Carrera(String nombre, int cantidadAlumnos){
        this.nombre = nombre;
        this.cantidadAlumnos = cantidadAlumnos;
        this.estudiantes = new Estudiante[cantidadAlumnos];
        this.contador = 0;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }   

    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        for(int i=0; i<contador; i++){
            if(estudiantes[i].getDocumento().equals(estudiante.getDocumento())){
                System.out.println("El estudiante con documento " + estudiante.getDocumento() + " ya está registrado.");
                return;
            }
        }
        if (contador < estudiantes.length) {
            estudiantes[contador] = estudiante;
            contador++;
        } else {
            System.out.println("No hay más espacio en la carrera");
        }
    }

    public void mostrarEstudiantes() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Estudiante: " +estudiantes[i].getDocumento() + " - " + estudiantes[i].getNombre() + " " + estudiantes[i].getApellido());
        }
    }

    public Estudiante buscarEstudiante(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (estudiantes[i].getNombre().equals(nombre)) {
                return estudiantes[i];
            }
        }
        return null;
    }

    public Estudiante[] getEstudiantes() { return estudiantes; }
    public int getContador() { return contador; }

    public String toString() {
        return "Carrera: " + nombre + ", Cantidad de Alumnos: " + cantidadAlumnos;
    }
}