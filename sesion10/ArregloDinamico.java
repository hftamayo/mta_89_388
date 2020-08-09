package sesion10;
import java.util.Scanner;

/*
por hacer: corregir los aspectos necesarios del siguiente codigo fuente
*/

public class ArregloDinamico {
    //propiedad estatica que va a controlar la captura de datos
    private static Scanner entradaTeclado;
    private static int longitudArreglo;

    private String[] nombreEstudiantes;

    public ArregloDinamico(){
        longitudArreglo = verificarLongitud();
    }
    
    public int verificarLongitud(){
        if(nombreEstudiantes == null || nombreEstudiantes.length ==0){
            //el arreglo aun no ha sido iniciado
            return 0;
        }
        else{
            return nombreEstudiantes.length;
        }
    }

    public void agregarEstudiante(){
        System.out.println("Proceso para captura de nuevo estudiante");
        int i = 0;
        int posicion;
        //verificar la longitud actual y redimensionar el nombreEstudiantes
        if(longitudArreglo > 0){
            String[] tmpNombreEstudiantes = new String[longitudArreglo];
            for(i=0; i<=longitudArreglo; i++){
                tmpNombreEstudiantes[i] = nombreEstudiantes[i];
            }
            //aumentar el tamaño de nombreEstudiantes
            nombreEstudiantes = new String[longitudArreglo+1]; //aumentamos 1 por el nuevo estudiante
            for(i=0; i<=longitudArreglo; i++){
                nombreEstudiantes[i] = tmpNombreEstudiantes[i];
            }
            posicion = nombreEstudiantes.length-1; //aca ya tenemos el espacio para el nuevo estudiante
            System.out.println("El valor asignado a posicion es: "+posicion);            
        }
        else{
            posicion = longitudArreglo; //aca es cero cuando es la primera vez que agregamos estduainte
            nombreEstudiantes = new String[posicion+1];
            System.out.println("El valor asignado a posicion es: "+posicion);
        }//fin del proceso de aumento de tamaño del arreglo

        try{
            entradaTeclado = new Scanner(System.in);
            System.out.println("Digite los nombres:");
            nombreEstudiantes[posicion] = entradaTeclado.nextLine();
            System.out.println("el proceso de captura de datos ha finalizado");                   
        }catch(ArrayIndexOutOfBoundsException errorArreglo){
            System.out.println("Error en el proceso de agregacion de estudiantes");
            errorArreglo.printStackTrace();
        }catch(Exception errorGeneral){
            System.out.println("Ocurrio un error un general");
            errorGeneral.printStackTrace();
        }
    }//fin de setDatosEstudiantes

    public void verEstudiantes(){
        if(nombreEstudiantes == null || nombreEstudiantes.length ==0){
            System.out.println("aun no se han registrado estudiantes");
        }
        else{
            System.out.println("Nombres de Estudiantes Registrados");
            System.out.println("Nombres del Estudiante");
            System.out.println("=================================");            
           for(int i=0; i<=nombreEstudiantes.length-1; i++){
               System.out.println(nombreEstudiantes[i]);
           }
           System.out.println("=================================");   
           System.out.println("Total de Alumnos: "+nombreEstudiantes.length);
        }        
    }//fin de verEstudiantes

    public void eliminarEstudiante(){
        System.out.println("Digite el codigo del estudiante a eliminar: ");
        //desarrollar la logica para eliminar el alumno de la posicion indicada
    }
    
}
