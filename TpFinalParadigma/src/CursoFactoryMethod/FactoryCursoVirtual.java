package CursoFactoryMethod;

public class FactoryCursoVirtual implements FactoryCurso{
	
	@Override
    public AbstractCurso crearCurso(String nombre, String codCatedra, String descripcion, String objetivo, String destinatario, double costo) {
        return new CursoVirtual(nombre, codCatedra, descripcion, objetivo, destinatario, costo);
    }
}
