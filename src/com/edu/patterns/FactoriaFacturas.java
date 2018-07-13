package com.edu.patterns;

/**
 * 
 * @author Ignacio
 * 
 * Patr�n de dise�o creacional que sirve para construir una jerarqu�a de clases.
 * 
 * Como vemos la clase Factura es una clase abstracta de la cual heredan nuestras dos clases concretas 
 * que implementan el c�lculo del IVA.  Vamos a construir una Factor�a para que se encargue de construir ambos 
 * objetos de la jerarqu�a.
 * 
 * Si nos fijamos la clase lo �nico que hace es instanciar un objeto u otro dependiendo del tipo que le solicitemos.
 * 
 * Nos podemos dar cuenta que el programador ya solo tiene que tratar con el concepto de Factura para el la clase FacturaIva 
 * y FacturaReducido no existen.
 * 
 * Esto permite una simplificaci�n a la hora de trabajar clara. Es cierto que las Factorias se encargan de generar una 
 * jerarqu�a de clases pero su funci�n fundamental es encapsular una jerarqu�a de objetos y reducir el conjunto de conceptos 
 * con los que trabajamos.
 * 
 * Factoria Facturas encapsula las subclases de la clase abstracta Factura.
 * 
 */

public class FactoriaFacturas {
	 
	public static Factura getFactura(String tipo) {
		if (tipo.equals("iva")) {
			return new FacturaIva();
		}
		else {
			return new FacturaIvaReducido();
		}
	}
	
	public static void main(String[] args) {
		
		Factura factura= FactoriaFacturas.getFactura("iva");
		factura.setId(1);
		factura.setImporte(100);
		System.out.println(factura.getImporteIva());
	}
}
