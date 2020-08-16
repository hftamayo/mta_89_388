package sesion11;

public class Formateo {
    public static void main(String args[]){  
        String nombre="sonoo";  
        String sf1=String.format("nombre es %s",nombre);  
        String sf2=String.format("el valor es %f",32.33434);  
        String sf3=String.format("el valor es %32.12f",32.33434);//devuelve 12 caracteres de 0  
          
        System.out.println(sf1);  
        System.out.println(sf2);  
        System.out.println(sf3);  
        }
}