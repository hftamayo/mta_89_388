package sesion09;
/*
ampliacion del ejemplo 4 para capturar datos de apellidos y notas del estudiante
los arreglos se van a declarar publicos para mostrar el acceso libre desde cualquier otra clase

*/

public class ArrUniE06 {
    public String[] nombreEstudiantes;
    public String[] apellidosEstudiantes;
    public Double[] calificacionesEstudiantes;

    public ArrUniE06(){
        nombreEstudiantes = new String[6];
        apellidosEstudiantes = new String[6];
        calificacionesEstudiantes = new Double[6];
    }
    
}