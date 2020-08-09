package sesion10;

import java.util.Scanner;

public class Sesion10 {
    private static Scanner tecladoUsuario;
    private static int decisionUsuario;
    private static boolean seguir = true;
    public static void main(String[] args){
        tecladoUsuario = new Scanner(System.in);
        do{
            ArregloDinamico estudiante = new ArregloDinamico();                   
            System.out.println("Programa de Registro Academico con Estructuras de Datos Dinamicas");
            System.out.println("Opciones disponibles: 1. Agregar un alumno, 2. Ver lista alumnos, 3. Eliminar un alumno, 4. Salir");
            decisionUsuario = tecladoUsuario.nextInt();
            switch(decisionUsuario){
                case 1:
                    estudiante.agregarEstudiante();
                    break;
                case 2:
                    estudiante.verEstudiantes();
                    break;
                case 3:
                    estudiante.verEstudiantes();
                    estudiante.eliminarEstudiante();
                    estudiante.verEstudiantes();                    
                    break;              
                case 4:
                    seguir = false;
                    break;
                default:
                System.out.println("Digite las opciones del 1 al 4");
                break;  
            }
        }while(seguir);
    }
    
}