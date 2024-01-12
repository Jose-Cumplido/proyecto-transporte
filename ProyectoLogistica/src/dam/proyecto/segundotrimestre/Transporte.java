package dam.proyecto.segundotrimestre;
/**
 * Clase Transporte en la cual se indicaran sus atributos, requisitos para crear un objeto a 
 * traves del contructor y metodos necesarios para trabajar con la clase.
 * @author cumpli
 * @version 1.0
 */
public class Transporte {
	private int numTransporte;
	private Cliente cliente;
	private Destinatario destinatario;
	private Vehiculo vehiculo;
	private int numBultos;
	private int peso;
	private String localidad;
	private boolean costePorte;
	
	public Transporte(int numTransporte, Cliente cliente, Destinatario destinatario, Vehiculo vehiculo, int numBultos,
			int peso, String localidad, boolean costePorte) {
		this.numTransporte = numTransporte;
		this.cliente = cliente;
		this.destinatario = destinatario;
		this.vehiculo = vehiculo;
		this.numBultos = numBultos;
		this.peso = peso;
		this.localidad = localidad;
		this.costePorte = costePorte;
	}
	public int getNumTransporte() {
		return numTransporte;
	}
	public void setNumTransporte(int numTransporte) {
		this.numTransporte = numTransporte;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Destinatario getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(Destinatario destinatario) {
		this.destinatario = destinatario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public int getNumBultos() {
		return numBultos;
	}
	public void setNumBultos(int numBultos) {
		this.numBultos = numBultos;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public boolean isCostePorte() {
		return costePorte;
	}
	public void setCostePorte(boolean costePorte) {
		this.costePorte = costePorte;
	}
}
