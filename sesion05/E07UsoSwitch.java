package sesion05;
/*
ejemplo sobre la estructura de control switch
Desplegar el nombre del dia de la semana basado en su numero correspondiente
*/

import java.util.Scanner;

public class E07UsoSwitch {
    static int diaSemNumero = 0;
    static String diaSemTexto;

    public static void main(String args[]){
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Programa para determinar el nombre del dia de la semana");
        System.out.println("Digite un numero entre 1 y 7: ");
        diaSemNumero = Integer.parseInt(entradaDatos.nextLine());

        /* POR HACER: verificar que clase de condiciones pueden evaluarse
        con Switch */
        switch(diaSemNumero){
            case 1:
                diaSemTexto = "Lunes";
                break;
            case 2:
                diaSemTexto = "Martes";
                break;               
            case 3:
                diaSemTexto = "Miercoles";
                break;                 
            case 4:
                diaSemTexto = "Jueves";
                break;               
            case 5:
                diaSemTexto = "Viernes";
                break;                
            case 6:
                diaSemTexto = "Sabado";
                break;               
            case 7:
                diaSemTexto = "Domingo";
                break;                  
        }//fin de switch
        System.out.println("El nombre del dia de la semana es: " +
        diaSemTexto);
    }//fin del metodo main
}