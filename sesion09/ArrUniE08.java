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
        nombreEstudiantes = new String[2];
        apellidosEstudiantes = new String[2];
        calificacionesEstudiantes = new Double[2];

    }

    public void setDatosEstudiantes(){
        System.out.println("Proceso para captura de datos de los estudiantes");
        entradaTeclado = new Scanner(System.in);
        //proceso para captura ciclica de los datos del estudiante
        for(int i=0; i<3; i++){
            System.out.println("Digitar los datos del estudiante en la posicion: " + i);
            System.out.println("Digite los nombres:");
            nombreEstudiantes[i] = entradaTeclado.nextLine();
            System.out.println("Digite los apellidos");
            apellidosEstudiantes[i] = entradaTeclado.nextLine();
            System.out.println("Digite la calificacion final"); 
            calificacionesEstudiantes[i] = entradaTeclado.nextDouble();   
            entradaTeclado.nextLine();                    
        }//fin de la estructura de control for
    }//fin de setDatosEstudiantes


    
}