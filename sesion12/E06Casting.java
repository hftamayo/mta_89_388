package sesion12;

public class E06Casting {
    public static void main(String[] args) {
        // variable en formato cadena
        String data = "10";
        System.out.println("El valor en formato cadena es: " + data);
    
        // conversion a entero
        int num = Integer.parseInt(data);
        System.out.println("El valor entero es: " + num);
        System.out.println("La suma de la nueva variable es: " 
        +(num+400));
      }
    
}