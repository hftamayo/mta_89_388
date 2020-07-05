public class MarioWhile {
    static int variable;
    public static void main(String args[]){
        variable = 5;
        int contar = 0;
        boolean continuar = true;
/*
        while(contar < variable){
            System.out.println(contar);
            contar++;
        System.out.println("El detalle de numeros es: "+contar);
    }
    */    
    while(continuar){
        //POR HACER: INVESTIGAR COMO SU AUMENTAR LA VARIABLE CONTAR CON EL OPERADOR ++ 
        contar++;
        if(contar <= 5){
            System.out.println(contar);
        }
        else{
            //finalizar la ejecucion del ciclo while
            continuar = false;
        }
    }
    
}
}
