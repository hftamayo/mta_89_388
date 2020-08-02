package sesion09;

public class ArrUniE05 {
    public static void main(String[] args){
        try{
            ArrUniE04 nombreEstudiantesInscritos = new ArrUniE04();            
            System.out.println("Obtener informacion de los estudiantes:");
            System.out.println("Primer alumno inscrito: " 
            + nombreEstudiantesInscritos.getPrimerEstudiante());
            System.out.println("Ultimo alumno inscrito: " 
            + nombreEstudiantesInscritos.getUltimoEstudiante());
            System.out.println("Cantidad de estudiantes inscritos: " 
            + nombreEstudiantesInscritos.getTotalEstudiantes());
            System.out.println("El tercer estudiante es:");
            nombreEstudiantesInscritos.getTercerEstudiante();

        }catch(ArrayIndexOutOfBoundsException errorArreglo){
            System.out.println("Error en la longitud del arreglo, notifique");
        }
        catch(Exception errorGeneral){
            System.out.println("Error no reportado, el programa se va a detener");
            errorGeneral.printStackTrace();
        }

    }
    
}