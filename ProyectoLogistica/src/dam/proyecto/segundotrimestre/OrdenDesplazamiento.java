package dam.proyecto.segundotrimestre;

import java.time.LocalDate;
/**
 * Clase OrdenDesplazamiento en la cual se indicaran sus atributos, requisitos para crear un objeto 
 * a traves del contructor y metodos necesarios para trabajar con la clase.
 * @author cumpli
 * @version 1.0
 */
public class OrdenDesplazamiento {
	private int numOrden;
	private Transporte transporte;
	private LocalDate fecha;
	
	public OrdenDesplazamiento(int numOrden, Transporte transporte, LocalDate fecha) {
		this.numOrden = numOrden;
		this.transporte = transporte;
		this.fecha = fecha;
	}

	public int getNumOrden() {
		return numOrden;
	}

	public void setNumOrden(int numOrden) {
		this.numOrden = numOrden;
	}

	public Transporte getTransporte() {
		return transporte;
	}

	public void setTransporte(Transporte transporte) {
		this.transporte = transporte;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
}
