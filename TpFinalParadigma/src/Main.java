
public class Main {

	public static void main(String[] args) {
		
// Crear una instancia de la fábrica

		FactoryPersona persona = (FactoryPersona) new RegistroPersona();

        

       
// Utilizar la fábrica para crear instancias de Alumno y Docente
        Alumno alumno = persona.crearAlumno("Juan", "Pérez", "12345678", "01/01/2000", 23);
        Docente docente = persona.crearDocente("María", "Gómez", "98765432", "15/05/1980", 42, "Currículum Vitae");

        

       
// Realizar operaciones con los objetos Alumno y Docente
    

	}

}
