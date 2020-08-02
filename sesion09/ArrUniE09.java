package sesion09;

import java.util.Scanner;

public class ArrUniE09 {
    private static Scanner tecladoUsuario;
    private static int decisionUsuario;
    public static void main(String[] args){
        tecladoUsuario = new Scanner(System.in);
        ArrUniE08 datosEstudiantes = new ArrUniE08();
        do{
            System.out.println("Programa de Registro Academico");
            System.out.println("Opciones disponibles: 1. Agregar Estudiantes, 2. Ver datos estudiantes");
            decisionUsuario = tecladoUsuario.nextInt();
            switch(decisionUsuario){
                case 1:
                datosEstudiantes.setDatosEstudiantes();
                break;
            }

        }while(true);
    }
    
}