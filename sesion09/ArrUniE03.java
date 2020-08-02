package sesion09;
/*
implementacion de la clase ArrUniE02, esto facilita la gestion del codgo asi como
ampliarlo
*/

public class ArrUniE03 {
    public static void main(String[] args){
        ArrUniE02 estudiantesInscritos = new ArrUniE02();
        System.out.println("Informacion de estudiantes matriculados en el curso de Dibujo:");
        System.out.println("Motivos por los cuales no tendemos a utilizar un arreglo: ");
        System.out.println("1. es diferente definir un arreglo a una variable");
        System.out.println("2. no es facil distinguir cuando es un arreglo y cuando es un objeto");
        System.out.println("3. no saber manejar la excepcion IndexOutOfBound");        
        System.out.println("Cantidad de estudiantes: "+estudiantesInscritos.toString());
    }//fin del metodo main
}