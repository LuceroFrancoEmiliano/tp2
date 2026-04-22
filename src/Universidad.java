public class Universidad {
    private String nombre;
    private String direccion;
    private Estudiante[] estudiantes;

    public Universidad(String nombre, String direccion, Estudiante[] estudiantes){
        setNombre(nombre);
        setDireccion(direccion);
        setEstudiantes(estudiantes);
    }

    //NOMBRE
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //DIRECCION
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //ESTUDIANTES
    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }
    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public String toString() {
        return "Universidad: " + nombre + ", Dirección: " + direccion + ", Cantidad de Estudiantes: " + estudiantes.length;
    }

}   