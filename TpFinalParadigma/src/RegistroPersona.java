

public class RegistroPersona implements FactoryPersona{
	
	private int contAlumnos = 1;

	    

	@Override
	public Alumno crearAlumno(String nombre, String apellido, String dni, String fechaNacimiento, int edad) {
	        String legajo = generarLegajo(dni);
	        return new Alumno(nombre, apellido, dni, fechaNacimiento, edad, legajo);
	}
	
	@Override
    public Docente crearDocente(String nombre, String apellido, String dni, String fechaNacimiento, int edad, String cv) {
        return new Docente(nombre, apellido, dni, fechaNacimiento, edad, cv);
    }

    private String generarLegajo(String dni) {
        String fechaActual = "22"; // Obtener los dos primeros dígitos del año actual
        
        String ultimosTresDigitosDni = dni.substring(dni.length() - 3);
        
       
        String contador = String.valueOf(contAlumnos++);
        	return fechaActual + "-" + ultimosTresDigitosDni + "-" + contador;
    }
}
	
	
	
	

	
