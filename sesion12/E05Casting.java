package sesion12;

public class E05Casting {
    public static void main(String[] args) {
        // variable tipo entera
        int num = 10;
        System.out.println("El valor en formato entero es: " + num);
    
        // conversion a formato cadena
        String data = String.valueOf(num);
        System.out.println("El valor en formato cadena es: " + data);
        System.out.println("La suma de la variable traducida es: "
        + data+"esta es una cadena, no puedo sumar"); 
      }
    
}