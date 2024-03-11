package dam.proyecto.segundotrimestre;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.jdt.annotation.NonNull;

/**
 * Clase Vehiculo en la cual se indicaran sus atributos, requisitos para crear un objeto a 
 * traves del contructor y metodos necesarios para trabajar con la clase.
 * @author cumpli
 * @version 1.0
 */
public class Vehiculo implements Comparable{
	private String matricula;
	private TipoVehiculo tipoVehiculo;
	private Transporte[] transporte;

	//constructor
	public Vehiculo(@NonNull String matricula, TipoVehiculo tipoVehiculo,Transporte[] transporte) {
		this.matricula=validarMatricula(matricula);
		this.tipoVehiculo=tipoVehiculo;
		this.transporte=transporte;
	}

	//metodos get y set para obtener y asignar valores
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public Transporte[] getTransporte() {
		return transporte;
	}

	public void setTransporte(Transporte[] transporte) {
		this.transporte = transporte;
	}


	//Tema6
	//g- Se han utilizado expresiones regulares en la búsqueda de patrones en cadenas de texto (10%).

	//metodo para validar una matricula
	private String validarMatricula(String matricula) {
		//Definimos el patron de caracteres general de un dni. 
		Pattern matriculaOld = Pattern.compile("^[A-Z]{1}[0-9]{4}[A-Z]{2}");
		//Definimos otro patron para el nie. 
		Pattern matriculaNew = Pattern.compile("^[0-9]{4}[A-Z]{3}");
		//le pasamos el patron especificado a matcher
		Matcher matcherOld = matriculaOld.matcher(matricula);
		//le pasamos el patron especificado a matcher
		Matcher matcherNew = matriculaNew.matcher(matricula);
		//Con el metodo matches comprobamos si la cadena recibida es correcta.
		if(matcherOld.matches()||matcherNew.matches()) {
			return matricula;	
		}
		//En caso de no coincidir con el patron no se devolvera el dni y se terminara el programa. 
		System.out.println("No se a podido añadir la matricula");
		System.exit(-1);
		return null;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
