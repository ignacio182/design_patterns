package com.edu.patterns;

/**
 * 
 * @author Ignacio
 * Singleton es una clase que solo se instancia una vez.
 * El constructor es privado, de esta forma se evita que se instancie.
 * posee un atributo privado singleton (estatico), que al comienzo es null. indicando que no se creo el objeto.
 * solo se puede obtener el unico objeto a traves del metodo getInstance (estatico). esto se hace
 * verificando que la var estatica singleton sea igual o distinto a null, si es igual significa que no hay
 * ningun objeto creado, caso contrario se devuelve el unico objeto ya instanciado.
 * Una clase Singleton es una forma útil de concentrar el acceso a recursos particulares en una sola instancia de clase
 * Por ejemplo: Una conexion a una base de datos.
 *
 */

public class Singleton {
	
	private static Singleton singleton = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}

	public void sayHello() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		
		Singleton singleton = Singleton.getInstance();
		singleton.sayHello();

	}

}
