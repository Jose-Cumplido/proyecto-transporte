package dam.proyecto.segundotrimestre;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.jdt.annotation.NonNull;

/**
 * Clase Empleado en la cual se indicaran sus atributos, requisitos para crear un objeto a 
 * traves del contructor y metodos necesarios para trabajar con la clase.
 * @author cumpli
 * @version 1.0
 */

//Tema4
//a- Se ha reconocido la sintaxis, estructura y componentes típicos de una clase (10%).
//b- Se han definido clases (10%)
//d- Se han definido propiedades y métodos (10%)
//g- Se han utilizado mecanismos para controlar la visibilidad de las clases y de sus miembros (5%)
//i- Se han creado y utilizado métodos estáticos (10%)

//Tema7:
//a- Se han identificado los conceptos de herencia, superclase y subclase.(20%)
//e- Se han diseñado y aplicado jerarquías de clases (10%).
//f- Se han probado y depurado las jerarquías de clases (15%).
public abstract class Persona implements Comparable{
	private static int countPersonas=1;
	private String nombre;
	private String apellido;
	private String nif;
	private String direccion;
	private String contacto;

	//Tema4
	//e- Se han creado constructores (5%)
	//k- Se han creado y utilizado conjuntos y librerías de clases (10%)

	//Escalada de contructores
	public Persona(@NonNull String nombre,@NonNull String nif,@NonNull String direccion) {
		this.nombre = nombre;
		this.nif = validarNif(nif);
		this.direccion = direccion;
		countPersonas++;
	}
	public Persona(@NonNull String nombre, String apellido, String nif, String direccion, String contacto) {
		this(nombre,nif,direccion);
		this.apellido = apellido;
		this.contacto = contacto;
	}
	//Tema7
	//b- Se han utilizado modificadores para bloquear y forzar la herencia de clases y métodos (15%).
	public abstract void consultarDatos();

	//Metodos get y set para obtener y asignar datos.
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	public String getNif() {
		return nif;
	}

	//Tema2
	//b- Se han escrito programas simples (25%).
	//c- Se han instanciado objetos a partir de clases predefinidas (5%).
	//d- Se han utilizado métodos y propiedades de los objetos (10%).
	//i- Se ha utilizado el entorno integrado de desarrollo en la creación y compilación de programas simples (10%).
	private String letraDNI(String nif) {
		//Diferentes letras que se les puede asignar a un dni de forma oficial
		char[] letras = new char[]{'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		//creamos una instancia de la clase StringBuilder a la cual le asignamos el valor recivido por parametro
		StringBuilder sb = new StringBuilder(nif);
		//guardamos la letra que recibimos
		Character letra= sb.charAt(nif.length()-1);
		//eliminamos la letra de la cadena
		sb.deleteCharAt(nif.length()-1);
		//convertimos el objeto a un String
		String identificador = sb.substring(0, sb.length());
		//el string anterior lo transformamos a un int para poder operar con el
		int numero= Integer.parseInt(identificador);
		//obtenemos el resto del numero en una variable la cual nos proporcionara el indice del array de letras
		int indiceLetra = numero%23;
		//En caso de que la letra sea igual al contenido dado por el indice del array sera un dni valido
		//por lo que devolvemos el nif
		if(letra.equals(letras[indiceLetra])) {
			return nif;
		}
		//en caso de no ser valido se indicara y se devolvera como un valor nulo
		System.out.println("La letra no coincide con el identificador.");
		return null;
	}

	//Tema1
	//b- Se han creado proyectos de desarrollo de aplicaciones (10%).
	//d- Se han identificado los distintos tipos de variables y la utilidad específica de cada uno (15%).
	//e- Se ha modificado el código de un programa para crear y utilizar variables (15%).
	//g- Se han clasificado, reconocido y utilizado en expresiones los operadores del lenguaje (15%).
	private String letraNIE(String nif) {
		char[] letras = new char[]{'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		StringBuilder sb = new StringBuilder(nif);
		Character letraPrimera= sb.charAt(0);
		Character letraUltima= sb.charAt(nif.length()-1);
		sb.deleteCharAt(nif.length()-1);
		char[] equivalencia = new char[]{'X','Y','Z'};
		int digito= letraPrimera.equals(equivalencia[0])?0:letraPrimera.equals(equivalencia[1])?
				1:letraPrimera.equals(equivalencia[2])?2:0;
		sb.replace(0, 1, String.valueOf(digito));
		String identificador = sb.substring(0, sb.length());
		int numero= Integer.parseInt(identificador);
		int indiceLetra = numero%23;
		if(letraUltima.equals(letras[indiceLetra])) {
			return nif;
		}else {
			System.out.println("La letra no coincide con el identificador.");
			return null;
		}
	}

	//Tema6
	//g- Se han utilizado expresiones regulares en la búsqueda de patrones en cadenas de texto (10%).

	//Metodo para comprobar la sintaxis de un nif
	private String validarNif(String nif) {
		//Definimos el patron de caracteres general de un dni. 
		Pattern patternDni = Pattern.compile("^[0-9]{8}[A-Z]{1}");
		//Definimos otro patron para el nie. 
		Pattern patternNie = Pattern.compile("^[A-Z]{1}[0-9]{7}[A-Z]{1}");
		//le pasamos el patron especificado a matcher
		Matcher matcherDni = patternDni.matcher(nif);
		//le pasamos el patron especificado a matcher
		Matcher matcherNie = patternNie.matcher(nif);
		//Con el metodo matches comprobamos si la cadena recibida es correcta para un dni.
		if(matcherDni.matches()) {
			//Tema2
			//f- Se han utilizado parámetros en la llamada a métodos (10%).
			
			//obtenemos en una variable el nif devuelto por el metodo letraDNI en caso de que sea correcto
			String comprobarNif = letraDNI(nif);
			//si es diferente de null el dni es valido
			if(comprobarNif!=null) {
				return nif;
				//en caso contrario el dni no es valido y salimos del programa
			}else {
				System.out.println("El formato es del nif es correcto pero no es valido");
				System.out.println("No se a podido añadir el nif");
				System.exit(-1);
				return null;
			}
			//en caso contrario comprobamos si se trata de un nie haciendo las mismas operaciones 
			//que en fragmento anterior con la diferencia de que ahora se llama al metodo 
			//letraNIE
		}else if(matcherNie.matches()){
			String comprobarNif = letraNIE(nif);
			if(comprobarNif!=null) {
				return nif;
			}else {
				System.out.println("El formato es del nif es correcto pero no es valido");
				System.out.println("No se a podido añadir el nif");
				System.exit(-1);
				return null;
			}
			//En caso de que no complan con los requisitos de un documento oficial saldremos del programa
		}else {

			//En caso de no coincidir con el patron no se devolvera el dni y se terminara el programa. 
			System.out.println("No se a podido añadir el nif");
			System.exit(-1);
			return null;
		}
	}

	//Metodos estaticos para consultar la cantidad de instancias creadas en la clase persona
	public static int  getCantidadPersonas() {
		return countPersonas;
	}
	public static int getCantidadClientes() {
		return (Persona.getCantidadPersonas()-Empleado.getCantidadEmpleado());
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", nif=" + nif + ", direccion=" + direccion
				+ ", contacto=" + contacto + "]";
	}
}