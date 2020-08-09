package sesion09;

import java.util.Scanner;

public class ArrUniE09 {
    private static Scanner tecladoUsuario;
    private static int decisionUsuario;
    private static boolean seguir = true;
    public static void main(String[] args){
        tecladoUsuario = new Scanner(System.in);
        ArrUniE08 datosEstudiantes = new ArrUniE08();
        do{
            System.out.println("Programa de Registro Academico");
            System.out.println("Opciones disponibles: 1. Agregar Estudiantes, 2. Ver datos estudiantes, 3. Salir");
            decisionUsuario = tecladoUsuario.nextInt();
            switch(decisionUsuario){
                case 1:
                    datosEstudiantes.setDatosEstudiantes();
                    break;
                case 2:
                    datosEstudiantes.getDatosEstudiantes();
                    break;              
                case 3:
                    seguir = false;
                    break;
                default:
                System.out.println("Digite las opciones 1, 2 o 3");
                break;  
            }
        }while(seguir);
    }
    
}
