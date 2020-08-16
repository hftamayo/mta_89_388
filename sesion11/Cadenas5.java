package sesion11;

public class Cadenas5{
    public static void main(String[] args) {
        String palindrome = "Aman a Panama";
        StringBuilder sb = new StringBuilder(palindrome);
        sb.reverse();  // funcion de inversion de los caracteres
        System.out.println("Oracion inicial:" + palindrome);
        System.out.println("misma oracion en reversa: "+ sb);
    }
}