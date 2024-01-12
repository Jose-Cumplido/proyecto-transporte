package dam.proyecto.segundotrimestre;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

/**
 * Clase principal para manejar los diferentes apartados del programa
 * @author cumpli
 * @version 1.0
 */
public class Test {

	public static void main(String[] args) {
		int opcionMenu;
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------");
		System.out.println("1-Administrar clientes");
		System.out.println("2-Administrar destinatario");
		System.out.println("3-Administrar vehiculo");
		System.out.println("4-Administrar transporte");
		System.out.println("5-Administrar orden de desplazamiento");
		System.out.println("----------------");
		System.out.print("Seleccione una opcion del menu:");
		opcionMenu = sc.nextInt();
		switch (opcionMenu) {
		case Menu.ADMINISTRACION_DE_CLIENTE:

			break;
		case Menu.ADMINISTRACION_DE_DESTINATARIO:

			break;
		case Menu.ADMINISTRACION_DE_VEHICULO:

			break;
		case Menu.ADMINISTRACION_DE_TRANSPORTE:

			break;
		case Menu.ADMINISTRACION_DE_ORDENESDESPLAZAMENTO:

			break;
		default:
			System.out.println("opcion no valida");
			break;
		}


	}

}
