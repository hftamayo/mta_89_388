import java.util.Scanner;

public class MesesMario {
    static int numeroMesAno = 0;
    static String nombreMesAno;

    public static void main(String args[]){
        Scanner entradaDatos = new Scanner(System.in);
        System.out.println("Programa para determinar el nombre del mes del año");
        System.out.println("Digite un numero entre 1 y 12: ");
        numeroMesAno = Integer.parseInt(entradaDatos.nextLine());

        switch(numeroMesAno){
            case 1:
                nombreMesAno = "Enero";
                break;
            case 2:
                nombreMesAno = "Febrero";
                break;               
            case 3:
                nombreMesAno = "Marzo";
                break;                 
            case 4:
                nombreMesAno = "Abril";
                break;               
            case 5:
                nombreMesAno = "Mayo";
                break;                
            case 6:
                nombreMesAno = "Junio";
                break;               
            case 7:
                nombreMesAno = "Julio";
                break; 
            case 8:
                nombreMesAno = "Agosto";
                break;      
            case 9:
                nombreMesAno = "Septiembre";
                break;
            case 10:
                nombreMesAno = "Octubre";
                break;  
            case 11:
                nombreMesAno = "Noviembre";
                break; 
            case 12:
                nombreMesAno = "Diciembre";
                break;             
        }//fin de switch
        System.out.println("El nombre del mes segun tu seleccion es: " +
        nombreMesAno);
    }//fin del metodo main
}