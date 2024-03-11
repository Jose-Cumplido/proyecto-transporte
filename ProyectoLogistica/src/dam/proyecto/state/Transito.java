package dam.proyecto.state;

import java.time.LocalDate;
/**
 * Clase encargada de mostrar la informacion de estado en transito
 */
public class Transito implements Seguimiento{

	@Override
	public void info() {
		System.out.println("Su transporte a sido registrado");
		System.out.println("Su transporte esta en transito");	
	}
}