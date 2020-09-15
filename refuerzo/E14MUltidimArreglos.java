package refuerzo;

public class E14MUltidimArreglos {
    public static void main(String[] args){
        //1. forma de declaracion
        String[][] alumnosNotas = new String[2][3];
        //2. agregacion de info
        alumnosNotas[0][0] = "Lionel Messi";
        alumnosNotas[0][1] = "Matematica";        
        alumnosNotas[0][2] = "7.5";                

        alumnosNotas[1][0] = "Luis Suarez";
        alumnosNotas[1][1] = "Sociales";        
        alumnosNotas[1][2] = "7.0";   
        
        /* IndexOutOfBoundException
        alumnosNotas[2][0] = "Neymar";
        alumnosNotas[2][1] = "Lenguaje";        
        alumnosNotas[2][2] = "5.0";   
*/
        System.out.println("Longitud del arreglo multidim: " + alumnosNotas.length);
//        for(int x = 0; x <= 2; x++){
          for(int x = 0; x <= 1; x++){    
            for(int y = 0; y <=2; y++){
                System.out.println(alumnosNotas[x][y]);
            }
        }
    }
}
