
public interface FactoryPersona {
	
	Alumno crearAlumno(String nombre, String apellido, String dni, String fechaNacimiento, int edad);
    Docente crearDocente(String nombre, String apellido, String dni, String fechaNacimiento, int edad, String curriculumVitae);

}
