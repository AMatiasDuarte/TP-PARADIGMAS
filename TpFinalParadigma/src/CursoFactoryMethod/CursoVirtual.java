package CursoFactoryMethod;

public class CursoVirtual extends AbstractCurso {
	
	protected String linkAcceso;
    protected String dia;
    protected String fechaCursado;

    public CursoVirtual(String nombre, String codCatedra, String descripcion, String objetivo, String destinatario, double costo) {
        super(nombre, codCatedra, descripcion, objetivo, destinatario, costo);
    }
	
}
