/*parsing: dividir un todo en varias partes
depurar el codigo para que ambas cadenas funcionen
*/

package sesion12;


import java.text.*; 
import java.util.*; 
import java.io.*; 

public class E02Parseo { 
	public static void main(String[] ar9) 
	{ 
		try { 
			// Establecer el formato del mensaje a parsear
			/* MessageFormat mf 
                = new MessageFormat("{0, date}, {2, time}, {1, number}");
                */ 
                MessageFormat mf 
                = new MessageFormat("{0, number, #}, {2, number, #.#}, {1, number, #.##}"); 
            ;                 

			// inicializar una cadena de valores
            //String str = "10, 20, 30"; 
            String str = "10.456, 20.325, 30.444";

			// convertir en porciones la cadena principal
			// atendiendo al formato establecido
			Object[] hash = mf.parse(str); 

			//mostrar los resultado
			System.out.println("Las porciones de la cadena son :"); 
			for (int i = 0; i < hash.length; i++) 
				System.out.println(hash[i]); 
		} 
		catch (ParseException e) { 
            System.out.println("Excepcion generada : " + e); 
            e.printStackTrace();
		} 
	} 
} 

