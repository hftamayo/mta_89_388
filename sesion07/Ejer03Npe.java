/* programa que demuestra es necesario verificar
una variable si ha sido inicializada antes de usarla*/

package sesion07;

import java.io.*; 

class Ejer03Npe 
{ 
	public static void main (String[] args) 
	{ 
		//esta variable no tiene contenido y se pide medir su longitud
		String s = "uno"; 
		try
		{ 
			System.out.println(getLength(s)); 
		} 
		catch(Exception monitorError) 
		{ 
			System.out.println("Un error ha sido detectado"); 
			monitorError.printStackTrace();
		} 

		// se agrega datos a la misma variable
		s = "Esta variable tiene contenido  123"; 
		try
		{ 
			System.out.println(getLength(s)); 
		} 
		catch(IllegalArgumentException e) 
		{ 
			System.out.println("IllegalArgumentException detectada"); 
		} 

		// nuevamente la variable es puesta en null y se solicita su longitud
		s = null; 
		try
		{ 
			System.out.println(getLength(s)); 
		} 
		/*
		catch(Exception error) 
		{ 
			System.out.println("Un error ha sido detectado"); 
			error.printStackTrace();
		} 
		*/
		catch(IllegalArgumentException e) 
		{ 
			System.out.println("El programa genero un error, favor reinicie"); 
			e.printStackTrace();
		} 
	} 

	/*
	funcion para devolver la longitud de una variable
	generar IllegalArgumentException si la variable es nula
	*/
	public static int getLength(String s) 
	{ 
		if (s == null) 
			throw new IllegalArgumentException("The argument cannot be null"); 
		return s.length(); 
	} 
} 
