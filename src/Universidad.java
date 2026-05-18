import java.util.ArrayList;
public class Universidad {
    private String nombre;
    private String direccion;
    private Estudiante[] estudiantes;
    private ArrayList<MiembroUniversidad> miembros = new ArrayList<>(); // ← inicializado acá

    public Universidad(String nombre, String direccion, Estudiante[] estudiantes) {
        setNombre(nombre);
        setDireccion(direccion);
        setEstudiantes(estudiantes);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public Estudiante[] getEstudiantes() { return estudiantes; }
    public void setEstudiantes(Estudiante[] estudiantes) { this.estudiantes = estudiantes; }

    public void agregarMiembro(MiembroUniversidad miembro) {
        miembros.add(miembro); // ← ya no necesita el if null
    }

    public void mostrarMiembros() {
        for (int i = 0; i < miembros.size(); i++) {
            System.out.println(miembros.get(i).obtenerInformacionCompleta());
        }
    }

    public void buscarPorRol(String rol) {
        boolean encontrado = false;
        for (int i = 0; i < miembros.size(); i++) {
            if (miembros.get(i).obtenerRol().equalsIgnoreCase(rol)) {
                System.out.println(miembros.get(i).obtenerInformacionCompleta());
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("No hay miembros con ese rol.");
    }

    public String toString() {
        return "Universidad: " + nombre + ", Dirección: " + direccion + ", Cantidad de Estudiantes: " + estudiantes.length;
    }
}
