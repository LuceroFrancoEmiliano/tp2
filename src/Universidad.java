import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private String direccion;
    private Estudiante[] estudiantes;
    private ArrayList<MiembroUniversidad> miembros;

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

    public void agregarMiembro(MiembroUniversidad miembro){
        if (miembros == null) {
            miembros = new ArrayList<>();
        }
        miembros.add(miembro);

    }
    public void mostrarMiembros(){
        if(miembros != null){
            for(int i=0; i<miembros.size(); i++){
                System.out.println(miembros.get(i).obtenerInformacionCompleta());
            }

        }

    }

    public void buscarPorRol(String rol){
        if(miembros != null){
            for(int i=0; i<miembros.size(); i++){
                if(miembros.get(i).obtenerRol().equalsIgnoreCase(rol)){
                    System.out.println(miembros.get(i).obtenerInformacionCompleta());
                }
            }
        } else{
            System.out.println("No hay miembros registrados en la universidad.");
        }
    }

    public String toString() {
        return "Universidad: " + nombre + ", Dirección: " + direccion + ", Cantidad de Estudiantes: " + estudiantes.length;
    }

}   