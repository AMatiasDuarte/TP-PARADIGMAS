package CursoFactoryMethod;

public abstract class AbstractCurso {
	
	protected String nombre;
    protected String codCatedra;
    protected String descripcion;
    protected String objetivo;
    protected String destinatario;
    protected double costo;

    public AbstractCurso(String nombre, String codCatedra, String descripcion, String objetivo, String destinatario, double costo) {
        this.nombre = nombre;
        this.codCatedra = codCatedra;
        this.descripcion = descripcion;
        this.objetivo = objetivo;
        this.destinatario = destinatario;
        this.costo = costo;
    }
	
	// INCLUIR LOS METODOS COMUNES PARA LAS CLASES
	
}
