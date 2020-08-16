package sesion11;

public class Cadenas4 {
    public static void main(String[] args) {
        String palindrome = "La casa de mi mama";
        System.out.println("La oracion a evaluar es: "+palindrome);
        int len = palindrome.length();
        char[] arregloTemporal = new char[len];
        char[] arregloCaracter = new char[len];
        
        // transformacion de la variable cadena en un arreglo
        for (int i = 0; i < len; i++) {
            arregloTemporal[i] = 
                palindrome.charAt(i);
        } 
        
        // se invierte el contenido del arreglo
        for (int j = 0; j < len; j++) {
            arregloCaracter[j] =
                arregloTemporal[len - 1 - j];
        }
        
        String reversePalindrome =
            new String(arregloCaracter);
        System.out.println("La oracion de derecha a izq es: "+reversePalindrome);

        //que el programa evalue si ambos resultados son iguales y muestre 
        //que es palindrome
        /*
        contenidoArreglo1[i] == contenidoArreglo2[j]
        */


    }
}