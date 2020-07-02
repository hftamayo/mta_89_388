/*
ejemplo de proceso repetitivo usando la estructura
de control for
esta estructura es exclusivamente para ejecutar procesos por lotes
escribir la tabla del 5
sintaxis de for:
for(punto de inicio; punto finalizacion; ritmo de incremento){}
*/

public class s04sem02 {
    static int tabla = 5;
    public static void main(String args[]){
        for(int inicio=0; inicio<=10; inicio++){
            System.out.println(tabla + " multiplicado por " + inicio 
            + " es igual a: "+(tabla * inicio));            
        }    
    }

    
}