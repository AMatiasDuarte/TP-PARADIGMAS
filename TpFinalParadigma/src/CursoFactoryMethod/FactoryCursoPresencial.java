package CursoFactoryMethod;

public class FactoryCursoPresencial implements FactoryCurso {
	
	@Override
    public AbstractCurso crearCurso(String nombre, String codCatedra, String descripcion, String objetivo, String destinatario, double costo) {
        
       
		return new CursoPresencial(nombre, codCatedra, descripcion, objetivo, destinatario, costo);
    }
}

