package sesion09;
/*
ampliacion del ejemplo 2 para su correcto uso
*/

public class ArrUniE04 {
    //definir el arreglo nombreEstudiantes
    private String[] nombreEstudiantes;

    public ArrUniE04(){
        nombreEstudiantes = new String[6];
        setNombreEstudiantes();
    }

    public void setNombreEstudiantes(){
        nombreEstudiantes[0] = "Maria";
        nombreEstudiantes[1] = "Carlos";
        nombreEstudiantes[2] = "Karla";
        nombreEstudiantes[3] = "Jose";
        nombreEstudiantes[4] = "Monica";            
        nombreEstudiantes[5] = "Jorge";                    
        nombreEstudiantes[6] = "Ligia";                            
    }

    public String getPrimerEstudiante(){
        return nombreEstudiantes[0];
    }
    
    public String getUltimoEstudiante(){
        return nombreEstudiantes[5];
    }    

    public int getTotalEstudiantes(){
        return nombreEstudiantes.length;
    }   
    
    public void getTercerEstudiante(){
        System.out.println(nombreEstudiantes[2]);
    }
}