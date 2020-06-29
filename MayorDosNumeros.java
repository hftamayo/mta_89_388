/*
programa para determinar el mayor de dos numeros
A es el numero mayor
B es el numero mayor
A y B son iguales
*/

public class MayorDosNumeros {
    static int numeroA;
    static int numeroB;
    /*
    por hacer:
    1. que el usuario digite los numeros
    2. que el programa se ejecuta hasta que el usuario decida
    3. validar que los numeros no vayan vacios
    */

    public static void main(String args[]){
        System.out.println("programa para determinar el mayor de dos numeros");
        numeroA = 5;
        numeroB = 10;

        if(numeroA > numeroB){
            //por hacer: que se muestre los numeros digitados
            System.out.println("El numeroA es mayor");
        }
        else{
            System.out.println("El numeroB es mayor");            
        }
        //y si ambos son iguales?
    }
}