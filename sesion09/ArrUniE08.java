package sesion09;
/*
definicion de los arreglos como privados para verificar el metodo de acceso
a sus valores
*/
import java.util.Scanner;

public class ArrUniE08 {
    //propiedad estatica que va a controlar la captura de datos
    private static Scanner entradaTeclado;


    private String[] nombreEstudiantes;
    private String[] apellidosEstudiantes;
    private Double[] calificacionesEstudiantes;

    public ArrUniE08(){
        nombreEstudiantes = new String[3];
        apellidosEstudiantes = new String[3];
        calificacionesEstudiantes = new Double[3];

    }

    public void setDatosEstudiantes(){
        System.out.println("Proceso para captura de datos de los estudiantes");
        try{
            entradaTeclado = new Scanner(System.in);
            //proceso para captura ciclica de los datos del estudiante
            for(int i=0; i<=2; i++){
                System.out.println("Digitar los datos del estudiante en la posicion: " + i);
                System.out.println("Digite los nombres:");
                nombreEstudiantes[i] = entradaTeclado.nextLine();
                System.out.println("Digite los apellidos");
                apellidosEstudiantes[i] = entradaTeclado.nextLine();
                System.out.println("Digite la calificacion final"); 
                calificacionesEstudiantes[i] = entradaTeclado.nextDouble();   
                entradaTeclado.nextLine(); 
                //limpiar pantalla
                Runtime.getRuntime().exec("clear");
                System.out.println("el proceso de captura de datos ha finalizado");                   
            }//fin de la estructura de control for
        }catch(ArrayIndexOutOfBoundsException errorArreglo){
            System.out.println("Error en el proceso de agregacion de estudiantes");
            errorArreglo.printStackTrace();
        }catch(Exception errorGeneral){
            System.out.println("Ocurrio un error un general");
            errorGeneral.printStackTrace();
        }
    }//fin de setDatosEstudiantes

    public void getDatosEstudiantes(){
        //verificar si no hay datos en nombre de estudiantes
        //limpiar pantalla
        int verificarContenido = 0;
        for(int i=0; i<=2; i++){
            if(nombreEstudiantes[i] != null){
                verificarContenido++;
            }
        }
        if(verificarContenido == 0){
            System.out.println("No hay datos que mostrar");
        }
        else{
            System.out.println("Datos de los estudiantes activos");
            System.out.println("=================================");
            System.out.println("Nombres"+"\t\t"+"Apellidos"+"\t\t"+"Calificacion");
            for(int i=0; i<=2; i++){
                System.out.println(nombreEstudiantes[i]+"\t\t"+
                apellidosEstudiantes[i]+"\t\t"+
                calificacionesEstudiantes[i]);
                System.out.println("-----------------------------");
            }
            System.out.println("=================================");   
            System.out.println("Total de Alumnos: "+nombreEstudiantes.length);    
        }//fin de verificacion si uno de los arreglos es nulo
    }//fin de getDatosEstudiantes
    
}
