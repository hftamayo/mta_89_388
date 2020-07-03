/*
programa para verificar si un numero es par
*/

public class Espar {
    static int numeroEvaluar;

    /*por hacer: 
    1. que el usuario pueda digitar los numeros a evaluar
    2. que el programa se ejecute hasta que el usuario escriba finalizar
    */
    
    public static void main(String args[]){
        numeroEvaluar = 11;
        if ((numeroEvaluar % 2) == 0){
            //por hacer: que en el mensaje aparezca el numero digitado
            System.out.println("El numero digitado es PAR");
        }
        else{
            //por hacer: que en el mensaje aparezca el numero digitado
            System.out.println("El numero digitado NO ES PAR");            
        }


    }//fin del metodo main
    
}