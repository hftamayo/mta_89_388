package refuerzo;
//mismo ejercicio pero captura de parametro desde ejecucion
public class E12EntradaDatos {
    public static void main(String[] args){
        System.out.println("Especifique fecha y nombre: ");
        String fecha = args[0];
        String nombre = args[1];
        System.out.println("El primer dato digitado es: " + fecha);
        System.out.println("El segundo dato digitado es: " + nombre);        

    }
    
}
