public class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;

    public Persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public String getDocumento() {
        return documento;
    }

    public void setNombre(String nombre) {
        if(!nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }
    public void setApellido(String apellido) {
        if(!apellido.isEmpty()) {
            this.apellido = apellido;
        }
    }
    public void setEdad(int edad) {
        if(edad >= 16) {
            this.edad = edad;
        }
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String toString() {
        return "Persona: " + nombre + " " + apellido + ", Edad: " + edad + ", Documento: " + documento;
    }

}