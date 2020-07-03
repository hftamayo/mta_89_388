/*
ejemplo de uso de la estructura de control  DO While
estamos seguros que al menos el menu debe ser desplegado 1 vez
*/
import java.util.Scanner;

public class E03UsoDoWhile{
    public static void main(String args[]){
        //0. definicion de variables dentro del metodo main
        Scanner entradaDatos = new Scanner(System.in);
        int decision = 0;//refactorar esta variable

        do{
            //1. despliegue de opciones
            System.out.println("===========================================================");            
            System.out.println("Programa para ejecutar un menu de opciones");
            System.out.println("===========================================================");                        
            System.out.println("Opcion 1: Codigo de ejemplo sobre E. de Control de Decision");
            System.out.println("Opcion 2: Codigo de ejemplo sobre E. de Control Repetitivas");
            System.out.println("Opcion 3: Codigo de ejemplo sobre E. de Control Ciclicas");
            System.out.println("Opcion 4: Codigo de ejemplo sobre E. de Control Selectivas");
            System.out.println("Digite el numero que corresponde a la opcion que desea ver: ");
            //2. captura de la decision del usuario
            decision = Integer.parseInt(entradaDatos.nextLine());
            //POR HACER: VALIDAR QUE EL USUARIO UNICAMENTE DIGITE VALORES ENTRE 1 Y 3
            //3. desplegar la opcion seleccionada
            System.out.println("La opcion que Ud. selecciono es: " + decision);
            //4. poner a cero nuevamente la variable seleccion ya que nuevamente se va a usar
            decision = 0;
            //5. preguntar al usuario si desea continuar
            System.out.println("Si desea salir del programa presione cero");
            decision = Integer.parseInt(entradaDatos.nextLine());
            //6. evaluar la seleccion del usuario
            if(decision == 0){
                //nos ahorramos el uso de una variable
                System.out.println("El programa va a finalizar");
                break;
            }
        }while(true);//fin de do while, la condicion se evalua al final
    }//fin del metodo main
}