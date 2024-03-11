package dam.proyecto.segundotrimestre;

import java.util.Arrays;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Clase Cliente en la cual se indicaran sus atributos, requisitos para crear un objeto a 
 * traves del contructor y metodos necesarios para trabajar con la clase.
 * @author cumpli
 * @version 1.0
 */
//Tema4
//h- Se han definido y utilizado clases heredadas (10%)
public final class Cliente extends Persona{
	private String idCliente;
	private Transporte[] transporte;
	//Tema7
	//c- Se ha reconocido la incidencia de los constructores en la herencia (5%).

	//escalada de constructores
	public Cliente(String nombre,String nif,String direccion) {
		super(nombre,nif,direccion);
		this.idCliente=nif;
	}
	public Cliente(@NonNull String nombre, String apellido, String nif, String direccion, String contacto) {
		this(nombre,nif,direccion);
		this.setApellido(apellido);
		this.setContacto(contacto);
	}

	//metodos get y set para obtener y asignar valores
	public Transporte[] getTransporte() {
		return transporte;
	}

	public void setTransporte(Transporte[] transporte) {
		this.transporte = transporte;
	}

	public String getIdCliente() {
		return idCliente;
	}

	//Tema7
	//d- Se han creado clases heredadas que sobrescriban la implementación de métodos de la superclase (15%).
	@Override
	public String toString() {
		return super.toString()+"Cliente [idCliente=" + idCliente + ", transporte=" + Arrays.toString(transporte) + "]";
	}

	//Metodo heredado de la clase padre, el cual es abstracto y aqui lo sobreescribimos
	//para mostrar los datos mas relevantes de un cliente

	//Tema7
	//b- Se han utilizado modificadores para bloquear y forzar la herencia de clases y métodos (15%).
	//metodo abstracto heredado de la clase padre para mostrar tanto el nombre como su direccion.
	@Override
	public final void consultarDatos() {
		String nombre,direccion;
		nombre=getNombre();
		direccion=getDireccion();
		System.out.println(nombre+", "+direccion);
	}
}