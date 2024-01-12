package dam.proyecto.segundotrimestre;
/**
 * Clase Vehiculo en la cual se indicaran sus atributos, requisitos para crear un objeto a 
 * traves del contructor y metodos necesarios para trabajar con la clase.
 * @author cumpli
 * @version 1.0
 */
public class Vehiculo{
	private String matricula;
	private TipoVehiculo tipoVehiculo;
	
	public Vehiculo( String matricula, TipoVehiculo tipoVehiculo) {
		this.matricula=matricula;
		this.tipoVehiculo=tipoVehiculo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	
}
