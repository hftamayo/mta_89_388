/*
programa que cuenta desde un limite hasta 1
*/

public class ContarHasta1 {
    static int limite;
    //por hacer: que el usuario digite el limite y que muestre la suma de la sec

    public static void main(String args[]){
        limite =20;
        while(limite == 1){
            System.out.println(limite);
            limite--;
        }//fin de while
        System.out.println("La suma de la serie fue: ");
    }//fin de main
    
}