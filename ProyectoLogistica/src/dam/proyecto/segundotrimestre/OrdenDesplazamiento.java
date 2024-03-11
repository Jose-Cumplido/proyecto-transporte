package dam.proyecto.segundotrimestre;

import java.time.LocalDate;

import org.eclipse.jdt.annotation.NonNull;
/**
 * Clase OrdenDesplazamiento en la cual se indicaran sus atributos, requisitos para crear un objeto 
 * a traves del contructor y metodos necesarios para trabajar con la clase.
 * @author cumpli
 * @version 1.0
 */
public class OrdenDesplazamiento {
	private int numOrden=0;
	private Transporte[] transporte;
	private Empleado empleado;
	private LocalDate fecha;

	//contructor
	public OrdenDesplazamiento(@NonNull int numOrden, Transporte[] transporte,Empleado empleado,
			LocalDate fecha) {
		this.numOrden = ++numOrden;
		this.transporte = transporte;
		this.empleado=empleado;
		this.fecha = fecha;
	}

	//metodos get y set para asignar valores
	public int getNumOrden() {
		return numOrden;
	}

	public void setNumOrden(int numOrden) {
		this.numOrden = numOrden;
	}

	public Transporte[] getTransporte() {
		return transporte;
	}

	public void setTransporte(Transporte[] transporte) {
		this.transporte = transporte;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

}
