package dam.proyecto.segundotrimestre;

public class Cliente {
	private String nombre;
	private String apellido;
	private String nif;
	private String direccion;
	
	public Cliente(String nombre, String apellido, String nif, String direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nif = nif;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}	
}