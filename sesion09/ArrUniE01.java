/*
ejercicios de refuerzo de la sesion 8: arreglos
*/

package sesion09;

public class ArrUniE01 {
    public static void main(String[] args){
    //1. declarar el arreglo: Nomina de estudiantes
    String[ ] nombreEstudiantes = new String[5]; //almacenar una longitud de 5 estudiantes
    //2. crear el arreglo: con la sentencia new de la linea anterior estoy reservando en menoria
    //espacio para el arreglo nombreEstudiantes

    //3. Inicializar los elementos del arreglo
    nombreEstudiantes[0] = "Maria";
    nombreEstudiantes[1] = "Carlos";    
    nombreEstudiantes[2] = "Jose";
    nombreEstudiantes[3] = "Hector";
    nombreEstudiantes[4] = "Rebeca";

    //4. Usar el arreglo
        System.out.println("Ejemplo 1 sobre el uso de Arreglos unidimensionales");
        System.out.println("El nombre del estudiante en la posicion 0 es: "+nombreEstudiantes[0]);

        System.out.println("El nombre del estudiante en la posicion 3 es: "+nombreEstudiantes[2]);   
        
        System.out.println("El ultimo estudiante registrado es: "+nombreEstudiantes[4]);        

        System.out.println("La longitud del arreglo es: "+nombreEstudiantes.length);
    }

}