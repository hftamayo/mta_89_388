package sesion09;
/*
implementacion de la clase del ejemplo 6
ya que los arreglos son publicos voy a poder cambiar sus valores
desde cualquier clase
*/

public class ArrUniE07 {
    public static void main(String[] args){
        ArrUniE06 estudiantes = new ArrUniE06();
        estudiantes.nombreEstudiantes[0] = "Carlos";
        estudiantes.apellidosEstudiantes[0] = "Perez";
        estudiantes.calificacionesEstudiantes[0] = 8.5;

        //imprimir el valor de las propiedades, esto es posible ya que han sido publicas
        System.out.println(estudiantes.nombreEstudiantes[0]);
        System.out.println(estudiantes.apellidosEstudiantes[0]);        
        System.out.println(estudiantes.calificacionesEstudiantes[0]);        

    }
    
}