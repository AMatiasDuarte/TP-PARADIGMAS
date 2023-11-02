package CursoFactoryMethod;

public interface FactoryCurso {
	
	AbstractCurso crearCurso(String nombre, String codigoCatedra, String descripcion, String objetivo, String dirigidoA, double costo);
	
}



