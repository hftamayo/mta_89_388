package sesion05;
/*
programa para mostrar las tablas de multiplicar del 1 al 10

sintaxis: MULTIPLICANDO * MULTIPLICADOR = RESULTADO

*/

public class E04UsoFor {
    public static void main(String args[]){
        System.out.println("Programa para mostrar las tablas de multiplicar del 1 al 10");
        for(int multiplicando = 1; multiplicando <=10; multiplicando++){
            System.out.println("-----------------------------");
            System.out.println("MOSTRANDO TABLA DEL: "+multiplicando);            
            System.out.println("-----------------------------");            
            for(int multiplicador = 1; multiplicador <=10; multiplicador++){
                System.out.println(multiplicando + " X " + multiplicador + " = " 
                + (multiplicando * multiplicador));
            }//fin del for que controla los multiplicadores
            System.out.println("-----------------------------");
            System.out.println("FIN DE LA TABLA DEL: "+multiplicando);            
            System.out.println("-----------------------------");                        
            System.out.println();
        }//fin del for que controla los multiplicandos
    }//fin del metodo main

    
}