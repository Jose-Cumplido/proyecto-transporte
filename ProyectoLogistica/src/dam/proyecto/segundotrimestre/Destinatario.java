package dam.proyecto.segundotrimestre;

import java.util.Arrays;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Clase Destinatario en la cual se indicaran sus atributos, requisitos para crear un objeto a 
 * traves del contructor y metodos necesarios para trabajar con la clase.
 * @author cumpli
 * @version 1.0
 */
public class Destinatario extends Persona{
	private String idDestinatario;
	private Transporte[] transporte;

	//escalada de contructores
	public Destinatario(String nombre,String nif,String direccion) {
		super(nombre,nif,direccion);
		this.idDestinatario=nif;
	}
	public Destinatario(@NonNull String nombre, String apellido, String nif, String direccion, String contacto) {
		this(nombre,nif,direccion);
		this.setApellido(apellido);
		this.setContacto(contacto);
	}


	//Metodos get y set para obtener y asignar valores
	public Transporte[] getTransporte() {
		return transporte;
	}

	public void setTransporte(Transporte[] transporte) {
		this.transporte = transporte;
	}

	public String getIdDestinatario() {
		return idDestinatario;
	}

	//sobreescritura del metodo toString.
	@Override
	public String toString() {
		return super.toString()+"Destinatario [idDestinatario=" + idDestinatario + ", transporte=" + Arrays.toString(transporte) + "]";
	}

	//metodo abstracto heredado de la clase padre para mostrar tanto el nombre como su direccion.
	@Override
	public final void consultarDatos() {
		String nombre,direccion,contacto;
		nombre=getNombre();
		direccion=getDireccion();
		contacto=getContacto();
		System.out.println(nombre+", "+direccion+", "+contacto);
	}
}