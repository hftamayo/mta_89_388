package sesion05;

/*
uso de for anidado para realizar una grafico
*/

public class E05UsoFor02{
    public static void main(String args[]){
        //el primer for controla el numero de lineas a graficar
        for(int i=1;i<=8;i++){  
            //el segundo for controla el relleno con los asteriscos
            for(int j=1;j<=i;j++){  
                    System.out.print("* ");  
            }  
        System.out.println();  
        }    
    }//fin del metodo main
}