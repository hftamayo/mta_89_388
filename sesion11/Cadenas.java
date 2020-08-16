package sesion11;

public class Cadenas {
    public static void main(String[] args){
        String texto = "El Niagara es una de las maravillas naturales";
        //charAt extrae un caracter a partir de una posicion en especifico
        //se puede iniciar contando desde la posicion cero para que devuelva 
        //el primer caracter
        //recordatorio: extrae el siguiente caracter despues de la posicion
        //que se especifico
        char extraerTexto = texto.charAt(1);
        //extraer el ultimo caracter de una cadena
        char ultimoCaracter = texto.charAt(texto.length()-1);

        //substring extrae un grupo de caracters a partir de una posicion hasta una final
        String nombreLugar = texto.substring(3, 10);
        String restoTexto = texto.substring(3);
    
        System.out.println("extraer texto: "+extraerTexto);
        System.out.println("Ultimo caracter: "+ultimoCaracter);        
        System.out.println("Nombre del lugar: " + nombreLugar);        
        System.out.println("Resto del texto: " + restoTexto);                
    }    
}