package sesion08;

  public class Ejemplo01 {

       public static void main(String arg[ ]) {

             String[ ] nombre = new String[4];
             try{
              nombre[0] = "Luis";

              nombre[1] = "María";
 
              nombre[2] = "Carlos";
 
              nombre[3] = "Jose";
 
              //nombre[4] = "Ismael";   //Error:No existe esta variable array de índice 4

             }catch(ArrayIndexOutOfBoundsException rutinaError){
               System.out.println("Ocurrio un error, el tamano del arreglo es menor al numero de datos");
             }
             catch(Exception rutinaErrorGeneral){
               System.out.println("Ocurrio un error inesperado");
               rutinaErrorGeneral.printStackTrace();
             }



     }

  }
  
