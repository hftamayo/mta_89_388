package sesion05;
/*
uso de estructura de control for each para operaciones
con estructuras de datos tipo arreglos
se ampliara explicacion en sigueintes sesiones
*/
public class E06UsoForEach {
    public static void main(String args[]){
        System.out.println("Programa para determinar la mayor calificacion");
        //Estructura de datos tipo arreglo
        int[] calificaciones = { 125, 1320, 300, 1116, 500 }; 
        int mayorCalificacionEvaluada = calificaciones[0];
        //uso de la E de Contro for each
        for(int calificacionEvaluada : calificaciones){
            //mostrar los valores que se estan evaluando
            System.out.println(calificacionEvaluada);
            if(calificacionEvaluada > mayorCalificacionEvaluada){
                mayorCalificacionEvaluada = calificacionEvaluada;
            }
        }//fin de for each
        //informar sobre la calificacion mayor
        System.out.println("La calificacion mayor es: "+mayorCalificacionEvaluada);
    }//fin del metodo main
}