package dam.proyecto.segundotrimestre;

import java.util.Arrays;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Clase Empleado en la cual se indicaran sus atributos, requisitos para crear un objeto a 
 * traves del contructor y metodos necesarios para trabajar con la clase.
 * @author cumpli
 * @version 1.0
 */

public class Empleado extends Persona {
	private static int countEmpleado=1;
	private String idEmpleado;
	private OrdenDesplazamiento[] ordenDesplazamiento;

	//contructor de empleado
	public Empleado(@NonNull String nombre, String apellido, String nif, String direccion, String contacto,
			String idEmpleado,OrdenDesplazamiento[] ordenDesplazamiento) {
		super(nombre, apellido, nif, direccion, contacto);
		this.idEmpleado=nif;
		this.ordenDesplazamiento=ordenDesplazamiento;
		countEmpleado++;
	}

	//Metodos get y set para obtener y asignar valores
	public OrdenDesplazamiento[] getOrdenDesplazamiento() {
		return ordenDesplazamiento;
	}

	public void setOrdenDesplazamiento(OrdenDesplazamiento[] ordenDesplazamiento) {
		this.ordenDesplazamiento = ordenDesplazamiento;
	}

	public String getIdEmpleado() {
		return idEmpleado;
	}

	public static int getCantidadEmpleado() {
		return countEmpleado;
	}

	//sobreescritura del metodo toString
	@Override
	public String toString() {
		return super.toString()+"Empleado [idEmpleado=" + idEmpleado + ", ordenDesplazamiento=" + Arrays.toString(ordenDesplazamiento)
		+ "]";
	}

	//metodo abstracto heredado de la clase padre para mostrar tanto el nombre como su direccion.
	@Override
	public final void consultarDatos() {
		String nombre,nif,direccion,contacto;
		nombre=getNombre();
		nif=getNif();
		direccion=getDireccion();
		contacto=getContacto();
		System.out.println(nombre+", "+nif+", "+direccion+", "+contacto);
	}
}