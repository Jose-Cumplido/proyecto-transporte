package dam.proyecto.segundotrimestre;

import java.util.Scanner;

import dam.proyecto.state.Ausente;
import dam.proyecto.state.Entregado;
import dam.proyecto.state.Registrado;
import dam.proyecto.state.Transito;


/**
 * Clase principal para manejar los diferentes apartados del programa
 * @author cumpli
 * @version 1.0
 */
public class Test {

	public static void main(String[] args) {
		//Tema1
		//c- Se han utilizado entornos integrados de desarrollo (10%).
		//Tema2
		//e- Se han escrito llamadas a métodos estáticos (5%).
		//h- Se han utilizado constructores (10%).
		//Tema3
		//e- Se han creado programas ejecutables utilizando diferentes estructuras de control (35%).
		//Tema4
		//j- Se han definido y utilizado interfaces (10%)
		//f- Se han desarrollado programas que instancien y utilicen objetos de las clases creadas anteriormente (20%)
		int opcionMenu;
		Scanner sc = new Scanner(System.in);

		//Creando objetos de prueba de diferentes clases anteriormente definidas
		Cliente clienteUno = new Cliente("alberto", "Z1013095L", "avenida goya Nº1");
		//		Cliente clienteDos = new Cliente("ruben", "30445581B", "avenida santa Nº45");
		//Objetos para seguimiento
		Registrado registrado = new Registrado();
		Transito transito = new Transito();
		Ausente ausente = new Ausente();
		Entregado entregado = new Entregado();
		//Tema3
		//b- Se han utilizado estructuras de repetición (20%). (c. repetido, ha sido eliminado)

		do {
			System.out.println("----------------");
			System.out.println("1-Administrar clientes");
			System.out.println("2-Administrar destinatario");
			System.out.println("3-Administrar vehiculo");
			System.out.println("4-Administrar transporte");
			System.out.println("5-Administrar orden de desplazamiento");
			System.out.println("6-Salir");
			System.out.println("----------------");
			System.out.print("Seleccione una opcion del menu:");
			opcionMenu = sc.nextInt();
			//Tema3
			//a- Se ha escrito y probado código que haga uso de estructuras de selección (10%).
			switch (opcionMenu) {
			case Menu.ADMINISTRACION_DE_CLIENTE:
				System.out.println(clienteUno.getNif());
				System.out.println(Persona.getCantidadClientes());
				break;
			case Menu.ADMINISTRACION_DE_DESTINATARIO:

				break;
			case Menu.ADMINISTRACION_DE_VEHICULO:

				break;
			case Menu.ADMINISTRACION_DE_TRANSPORTE:
				Transporte transporte = new Transporte(new Cliente("jose", "31538548E", "falsa 123"),
						new Destinatario("jose", "31538548E", "falsa 123"),
						new Vehiculo("1234ASD", new TipoVehiculo("furgon", 1000), null)
						, 2, 10, 5, "palma", true);
				System.out.println("elija una opcion:");
				System.out.println("1-registrado");
				System.out.println("2-Transito");
				System.out.println("Ausente");
				System.out.println("Entregado");
				opcionMenu=sc.nextInt();
				switch(opcionMenu) {
				case MenuSeguimiento.REGISTRADO:
					transporte.setEstado(registrado);
					break;
				case MenuSeguimiento.TRANSITO:
					transporte.setEstado(transito);
					break;
				case MenuSeguimiento.AUSENTE:
					transporte.setEstado(ausente);
					break;
				case MenuSeguimiento.ENTREGADO:
					transporte.setEstado(entregado);
					break;
				case MenuSeguimiento.SALIR:
					break;
				default:
					System.out.println("Opcion no valida");
				}
				transporte.ConsultarSeguimiento();
				break;
			case Menu.ADMINISTRACION_DE_ORDENESDESPLAZAMENTO:

				break;
			case Menu.SALIR:
				System.out.println("Ha seleccionado salir.");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		}while(opcionMenu!=6);
		sc.close();
	}
}