/*
programa para contar  hasta un limite
*/

public class ContarHastaDiez {
    static int limite;
    //por hacer: que el usuario digite el limite y que muestre la suma de la sec

    public static void main(String args[]){
        limite =30;
        int contador = 0;
        while(contador <= limite){
            System.out.println(contador);
            contador++;
        }//fin de while
        System.out.println("La suma de la serie fue: ");
    }//fin de main
}