/*
programa principal
POR HACER:
1. pensar en un metodo para captura de datos que sea facil de depurar
2. hacer los ajustes necesarios para efectuar un pedido
3. asegurarse que el cliente puede ejecutar el programa siempre y cuando
digite la palabra "continuar", pero y si digita CONTINUAR, Continuar
4. que exista un metodo para visualizar la data que el usuario digito
*/

package pizzadelivery;

import java.util.Scanner;

public class Pedidos {
    /* ejemplo de valores constantes dentro del giro del negocio
    deben ser declarados como final*/
    private static final Double montoIVA = 0.13;
    private final String nitNegocio = "0614-010101-111-5";
    private final String numeroCallCenterNegocio = "2257-7777";

    public static void main(String args[]){
        Scanner entradaTeclado = new Scanner(System.in);
        do{
            System.out.println("Punto de Venta de Pizza Boom Delivery");
            System.out.println("Seleccione la opcion que necesita:");
            System.out.println("1. para Agregar Cliente");
            System.out.println("2. Agregar Producto");
            System.out.println("3. Hacer un Pedido");            
            int decision = Integer.parseInt(entradaTeclado.nextLine());
            switch(decision){
                case 1: //agregar cliente
                Cliente nuevoCliente = new Cliente();
                //ejemplo de acceso a un elemento publico
                //tambien es un ejemplo de metodo de instancia
                nuevoCliente.getCodigoCliente();
                /* ejemplo de la prohibicion de acceso a un metodo privado
                debe generarse un error al tratar de asignar de manera directa el nombre 
                del cliente. Se verifica en tiempo de interpretacion
                */
                //nuevoCliente.nombreCliente = "esto es una prueba";
                break;
        
                case 2: //agregar producto
                //POR HACER: EVALUAR EL MEJOR MECANISMO PARA CAPTURAR DATOS
                //Y CREAR INSTANCIA DE CADA CLASE
                Menu nuevoMenu = new Menu();
                Pastas nuevaPasta = new Pastas();
                //Pizza nuevaPizza = new Pizza();
                /* se necesita un nuevo mecanismo
                para preguntarle al usuario que tipo de especialidad
                necesita registrar */
                break;

                case 3: //agregar pedido
                //?? como hacemos para capturar data del pedido
                break;

                default:
                 System.out.println("Digite un numero entre 1 y 3");
                 break;
                 
            }

            System.out.println("Si desea continuar utilizado el programa escriba continuar: ");
            String decidir = entradaTeclado.nextLine();
            /*
            intepretacion de la linea 55:
            si el contenido de la variable decidir ES DIFERENTE DE continuar entonces finalice
            caso contrario siga el ciclo
            */
            if(!decidir.equals("continuar")){
                //entradaTeclado.close();
                break;
            }
        }while(true);
        System.out.println("El programa ha finalizado");

    }//fin de main
}