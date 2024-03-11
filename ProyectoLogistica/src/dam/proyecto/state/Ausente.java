package dam.proyecto.state;
/**
 * Clase encargada de mostrar la informacion de estado si se encuentran ausentes
 */
public class Ausente implements Seguimiento{

	@Override
	public void info() {
		System.out.println("Su transporte a sido registrado");
		System.out.println("Su transporte esta en transito");
		System.out.println("No se pudo realizar la entrega, "+
				"contacte con nosotros");
	}
}