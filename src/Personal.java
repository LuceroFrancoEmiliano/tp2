public class Personal extends Persona implements MiembroUniversidad {
    private String departamento;
    private String puesto;
    private java.time.LocalDate fechaIngreso;
    
    public Personal(String nombre, String apellido, int edad, String documento, String departamento, String puesto, java.time.LocalDate fechaIngreso) {
        super(nombre, apellido, edad, documento);
        this.departamento = departamento;
        this.puesto = puesto;
        this.fechaIngreso = fechaIngreso;
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public java.time.LocalDate getFechaIngreso() {
        return fechaIngreso;
    }
    public void setFechaIngreso(java.time.LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String toString() {
        return "Personal: " + getNombre() + " " + getApellido() + ", Departamento: " + departamento + ", Puesto: " + puesto + ", Fecha de Ingreso: " + fechaIngreso;
    }

    public String obtenerRol() {
        return "Personal";
    }
    public String obtenerInformacionCompleta() {
        return toString();
    }

}   
