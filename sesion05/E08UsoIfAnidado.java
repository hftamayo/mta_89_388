package sesion05;

/*
programa para evaluar el mayor y menor entre 4 numeros
*/


import java.util.Scanner;

public class E08UsoIfAnidado {
    public static void main(String[] args) {
        Scanner entradaDatos=new Scanner(System.in);
        int numeroMayor,numeroMenor;
        System.out.println("Ingrese el primer numero ");
        int A = entradaDatos.nextInt();
        System.out.println("Ingrese el segundo numero ");
        int B = entradaDatos.nextInt();
        System.out.println("Ingrese el tercer numero ");
        int C = entradaDatos.nextInt();
        System.out.println("Ingrese el cuarto numero ");
        int D = entradaDatos.nextInt();
        if(A > B && A > C && A > D){
            numeroMayor=A;
        }else{
            if(B > A && B > C && B > D){
                numeroMayor=B;
            }else{
                if(C > A && C > B && C > D){
                    numeroMayor=C;
                }else
                    numeroMayor=D;
            }
        }
        if(A < B && A < C && A < D){
            numeroMenor=A;
        }else{
            if(B < A && B < C && B < D){
                numeroMenor=B;
            }else{
                if(C < A && C < B && C < D){
                    numeroMenor=C;
                }else
                    numeroMenor=D;
            }
        }
        System.out.println("el mayor es "+numeroMayor+" y el menor es "+numeroMenor);
     }//fin del metodo main
}//fin de la clase