package dam.proyecto.state;

import java.time.LocalDate;
/**
 * Clase encargada de mostrar la informacion de estado una vez registrado
 */
public class Registrado implements Seguimiento{

	@Override
	public void info() {
		System.out.println("Su transporte a sido registrado");
	}
}