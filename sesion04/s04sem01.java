/*
sesion de trabajo julio 1 2020
ejercicio con estructura de control while
logica: 
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
*/
public class s04sem01 {
    static int tabla = 5;
    static int contador = 0;

    public static void main(String args[]){
        System.out.println("Tabla de multiplicar usando While");
        while(contador <= 10){
            System.out.println(tabla + " multiplicado por " + contador 
            + " es igual a: "+(tabla * contador));
            contador++;
        }//fin de while
    }
    
}