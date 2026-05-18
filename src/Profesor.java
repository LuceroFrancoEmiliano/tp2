public class Profesor extends Persona implements MiembroUniversidad {
    private String especialidad;
    private int añosDeExperiencia;
    private Materia[] materias;
    private int contadorMaterias; 

    public Profesor(String nombre, String apellido, int edad, String documento, String especialidad, int añosDeExperiencia) {
        super(nombre, apellido, edad, documento);
        this.especialidad = especialidad;
        this.añosDeExperiencia = añosDeExperiencia;
        this.contadorMaterias = 0;
        this.materias = new Materia[10];
    }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public int getAñosDeExperiencia() { return añosDeExperiencia; }
    public void setAñosDeExperiencia(int añosDeExperiencia) {
        if (añosDeExperiencia >= 0) this.añosDeExperiencia = añosDeExperiencia;
    }

    public int getContadorMaterias() { return contadorMaterias; }

    public void asignarMateria(Materia materia) {
        if (contadorMaterias < materias.length) {
            this.materias[contadorMaterias] = materia;
            contadorMaterias++;
        } else {
            System.out.println("Límite de materias asignadas alcanzado.");
        }
    }

    @Override
    public String toString() {
        return "Profesor: " + getNombre() + " " + getApellido() + ", Especialidad: " + especialidad + ", Años de Experiencia: " + añosDeExperiencia;
    }

    @Override
    public String obtenerRol() { return "Profesor"; }

    @Override
    public String obtenerInformacionCompleta() { return toString(); }
}
