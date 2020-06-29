/*
Inventario: utiliza las clases umedida, proveedores, lineas y catalogo productos
para administrar operaciones de datos (creacion, lectura, actualizacion y eliminac) del inventario
autor: htamayo
fecha creacion:
comentarios
*/

import java.util.Scanner;

public class Inventario{
    public static void main(String args[]){
        //1. mensaje explicativo
        System.out.println("Programa para gestion del inventario");
        //2. instancia de la clase Scanner para captura de datos
        Scanner entradaDatos = new Scanner(System.in);
        //3. captura de datos de entrada
        System.out.println("Agregacion de una nueva unidad de medida");
        System.out.println("Digite el codigo de la unidad de medida:");

        //nota: necesito un dar un salto de carro(enter) o bien hacer una conversion de datos
        //enfoque 1
        //int codigo = entradaDatos.nextInt();
        //entradaDatos.nextLine();
        //enfoque 2
        int codigo = Integer.parseInt(entradaDatos.nextLine());
        
        System.out.println("Digite el nombre de la unidad de medida:");    
        String nombre = entradaDatos.nextLine();
        
        System.out.println("Digite la descripcion de la unidad de medida:");    
        String descripcion = entradaDatos.nextLine();

        System.out.println("Digite 1 para estado activo, 0 para inactivo:");    
        int estado = entradaDatos.nextInt();    
        
        //4. creacion de la instancia de Unidad de Medida
        Umedida um = new Umedida(codigo, nombre, descripcion, estado);
        //5. salida de datos de Unidad de Medida
        System.out.println("Los datos ha sido registrados: ");
        System.out.println("codigo: " +um.getCodigoUmedida());
        System.out.println("nombre: " +um.getNombreUmedida());
        System.out.println("descripcion: " + um.getDescripcionUmedida());
        //6. mostrar al usuario el estado de la u. de medida de manera descriptiva
        if(um.getEstadoUmedida() == 1){
            System.out.println("Estado de la U de Medida: HABILITADA");
        }
        else{
            System.out.println("Estado de la U de Medida: DESHABILITADA");        
        }
    }//fin del metodo main
}//fin de la clase inventario
