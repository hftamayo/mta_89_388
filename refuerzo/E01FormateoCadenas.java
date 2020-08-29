package refuerzo;
/*
formateo de salida de datos por medio de la funcion printf()
su funcionamiento es similar a la funcion del mismo nombre en C

La sintaxis puede ser:
System.out.printf(format, arguments);
	System.out.printf(locale, format, arguments);

reglas de formateo:
	%[banderas][ancho][.precision]caracteres de conversion

caracteres de conservion:
s : formateo de cadenas
d : formateo de enteros y decimales
f : formateo numeros con precision de punto flotante
t : formateo de fechas / horas

banderas: modificaciones para la salida de datos
ancho : ancho de la salida de datos
precision: numero de digitos en la salida de datos

printf usa java.util.Formatter y java.io.PrintStream

*/

public class E01FormateoCadenas {
    public static void main(String[] args){
        //enviar un retorno de carro entre palabras
        System.out.printf("Java%nEstandar%nEdition%n");

        //formateo de boolean, %b%B es para minusculas/mayusculas
        System.out.printf("%B%n", false);
        System.out.printf("%B%n", 5.3);
        System.out.printf("%b%n", "texto al azar");
            
        //formateo de cadenas:
        System.out.printf("'%s' %n", "refuerzo en java");
        System.out.printf("'%S' %n", "refuerzo en java");
            
        //especificar ancho de cadena:
        System.out.printf("'%15s' %n", "ejercicios java para mta");

        //justificacion a la izquierda:
        System.out.printf("'%-10s' %n", "ejercicios java para mta");

        //formateo de numeros,

        //usar separador de millares

        //float y dobles:

        //formateo de fecha y hora detallada


        
    }   
}