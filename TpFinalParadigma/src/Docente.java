
public class Docente extends AbstractPersona{
	
	private String cv;

    public Docente(String nombre, String apellido, String dni, String fechaNacimiento, int edad, String cv) {
        super();
        this.cv = cv;
    }

	public String getCv() {
		return cv;
	}

	public void setCv(String cv) {
		this.cv = cv;
	}
	
    
}
