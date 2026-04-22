public class Materia {
    private String nombre;
    private String codigo;
    private int creditos;
    private double calificacion;

    public Materia(String nombre, String codigo, int creditos, double calificacion) {
        setNombre(nombre);
        setCodigo(codigo);
        setCreditos(creditos);
        setCalificacion(calificacion);
    }

    //NOMBRE
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //CODIGO
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    //CREDITOS
    public int getCreditos() {
        return creditos;
    }
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    //CALIFICACION
    public double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }








}