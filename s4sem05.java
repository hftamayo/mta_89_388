/*
ejercicio para ejecutar el ejemplo de decrementar un numero
con la ampliacion que el usuario debe informar cuando desea terminar 
ejecucion
*/

import java.util.Scanner;

import javax.imageio.plugins.tiff.ExifTIFFTagSet;

public class s4sem05 {
    static int limiteSuperior = 0;
    static int seguir = 1;
    public static void main(String args[]){
        System.out.println("programa para contar hasta 1");

        while(seguir > 0){
            Scanner entradaDatos = new Scanner(System.in);
 
            System.out.println("digite un numero mayor a 1: ");
            //se hara un casting de un string a un entero
            limiteSuperior = Integer.parseInt(entradaDatos.nextLine());
    
            for(int i = limiteSuperior; i >= 1; i--){
                System.out.println(i);
            }//fin del for
    
            System.out.println("Para finalizar presione cero(0)");
            Scanner respuesta = new Scanner(System.in);
            seguir = Integer.parseInt(respuesta.nextLine());
            if(seguir == 0){
                exit;
            }
        }//fin de while
    }//fin de la clase main        
}//fin de la clase s4