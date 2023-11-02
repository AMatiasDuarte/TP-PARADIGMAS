package CursoFactoryMethod;

public class MainCurso {

	public static void main(String[] args) {
		
		// Crear fábricas para cursos presenciales y virtuales
        
		FactoryCurso presencialFactory = new FactoryCursoPresencial();
        
        FactoryCurso virtualFactory = new FactoryCursoVirtual();
        
        // Crear cursos utilizando las fábricas
        
        AbstractCurso CursoPresencial = presencialFactory.crearCurso("Matemáticas Presencial", "MATH101", "Curso de Matemáticas Presencial", "Estudiantes de Matemáticas", 100.0);
        AbstractCurso CursoVirtual = virtualFactory.crearCurso("Programación Virtual", "CS101", "Curso en línea de Programación", "Estudiantes de Programación", 50.0);
        
        
        // Realizar operaciones con los cursos
        
        
	}

}
