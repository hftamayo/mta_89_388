//parsing:dividir en secciones una cadena
package sesion12;
//obtiene un periodo de tiempo a partir de una cadena
import java.time.Period; 

public class E01Parseo {

	public static void main(String[] args) 
	{ 

		//Cadena a ser seccionada 
		String periodo = "P8Y22M700D"; 

		// traducir la cadena en un objeto Period
		// usar la funcion parse()
		Period p = Period.parse(periodo); 

		System.out.println(p.getYears() + " Años\n"
						+ p.getMonths() + " Meses\n"
						+ p.getDays() + " Dias"); 
	} 
} 