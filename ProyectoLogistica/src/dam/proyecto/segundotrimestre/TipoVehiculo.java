package dam.proyecto.segundotrimestre;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Clase TipoVehiculo en la cual se indicaran sus atributos, requisitos para crear un objeto a 
 * traves del contructor y metodos necesarios para trabajar con la clase.
 * @author cumpli
 * @version 1.0
 */
public class TipoVehiculo {
	private String nombre;
	private int capacidad;

	//contructor
	public TipoVehiculo(@NonNull String nombre, int capacidad) {
		this.nombre = nombre;
		this.capacidad = capacidad;
	}

	//metodos get y set para obtener y asignar valores
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

}
