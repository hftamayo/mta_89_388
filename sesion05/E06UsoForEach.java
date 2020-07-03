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
        int[] calificaciones = { 125, 132, 300, 116, 110 }; 
        int mayorCalificacionEvaluada = calificaciones[0];
        //uso de la E de Contro for each
        for(int calificacionEvaluada : calificaciones){
            if(calificacionEvaluada > mayorCalificacionEvaluada){
                mayorCalificacionEvaluada = calificacionEvaluada;
            }
        }//fin de for each
        //informar sobre la calificacion mayor
        System.out.println("La calificacion mayor es: "+mayorCalificacionEvaluada);
    }//fin del metodo main
}