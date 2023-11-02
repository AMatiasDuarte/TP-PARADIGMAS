package CursoFactoryMethod;

public class CursoPresencial extends AbstractCurso{
	
	protected String dia;
    protected String horario;
    protected int cupoMaximo;

    public CursoPresencial(String nombre, String codCatedra, String descripcion, String objetivo, String destinatario, double costo) {
        super(nombre, codCatedra, descripcion, objetivo, destinatario, costo);
        this.cupoMaximo = 15;
    }

    // Métodos y propiedades específicos para cursos presenciales
    
}
