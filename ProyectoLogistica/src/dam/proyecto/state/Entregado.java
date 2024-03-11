package dam.proyecto.state;
/**
 * Clase encargada de mostrar la informacion de estado una vez entregado
 */
public class Entregado implements Seguimiento{

	@Override
	public void info() {
		System.out.println("Su transporte a sido registrado");
		System.out.println("Su transporte esta en transito");
		System.out.println("Entregado");		
	}
}