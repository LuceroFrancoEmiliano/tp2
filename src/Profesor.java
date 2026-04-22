public class Profesor extends Persona implements MiembroUniversidad {
    private String especialidad;
    private int añosDeExperiencia;
    private int materiasAsignadas;
    private Materia[] materias;

    public Profesor(String nombre, String apellido, int edad, String documento, String especialidad, int añosDeExperiencia) {
        super(nombre, apellido, edad, documento);
        this.especialidad = especialidad;
        this.añosDeExperiencia = añosDeExperiencia;
        this.materiasAsignadas = 0;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }
    public void setAñosDeExperiencia(int añosDeExperiencia) {
        if (añosDeExperiencia >= 0) {
            this.añosDeExperiencia = añosDeExperiencia;
        }
    }
    public int getMateriasAsignadas() { 
        return materiasAsignadas;
    }
    public void asignarMateria(Materia materia) {
        if (materiasAsignadas < materias.length) {
            this.materias[materiasAsignadas] = materia;
            materiasAsignadas++;
        } else {
            System.out.println("Limite de materias asignadas alcanzado.");
        }
    }

    public String toString() {
        return "Profesor: " + getNombre() + " " + getApellido() + ", Especialidad: " + especialidad + ", Años de Experiencia: " + añosDeExperiencia;
    }
    
    public String obtenerRol() {
        return "Profesor";
    }
    public String obtenerInformacionCompleta() {
        return toString();
    }
}
