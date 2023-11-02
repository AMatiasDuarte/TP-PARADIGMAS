

public class Alumno extends AbstractPersona{
	
	protected String legajo;

    public Alumno(String nombre, String apellido, String dni, String fechaNacimiento, int edad, String legajo) {
        
       super();
       
       this.legajo = legajo;
    }

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	
    
	
	
}
