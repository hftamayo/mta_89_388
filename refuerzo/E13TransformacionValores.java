package refuerzo;

public class E13TransformacionValores {
    public static void main(String args[]){
        String nombre = "Christopher";
        nombre = nombre.substring(0, 5);
        System.out.println("primeras letras: " + nombre);
        String salida = String.format("%s es  %d caracteres de longitud", nombre, nombre.length());
        System.out.println(salida);
    }
    
}
