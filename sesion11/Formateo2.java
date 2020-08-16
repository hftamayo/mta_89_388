package sesion11;

public class Formateo2 {
    public static void main(String[] args) {  
        String str1 = String.format("%d", 101);          // representac enteros
        String str2 = String.format("%s", "Gerardo Barrios"); // cadena
        String str3 = String.format("%f", 101.00);       // float  
        String str4 = String.format("%x", 101);          // hexadecimal
        String str5 = String.format("%c", 'c');          // caracter 
        System.out.println(str1);  
        System.out.println(str2);  
        System.out.println(str3);  
        System.out.println(str4);  
        System.out.println(str5);  
    }  
    
}