package sesion10;
import java.util.ArrayList;
import java.util.Arrays;

/*
contrario a los arreglos, las listas no pueden iniciarlizarse con elementos de manera directa
en este ejemplo usaremos una funcion especial
*/
public class ArregloList2 {
    public static void main(String[] args) {

        ArrayList<String> animales = new ArrayList<>(Arrays.asList("gato", "perro", "perico"));
        System.out.println("Animales: " + animales);

        String element = animales.get(4);
        System.out.println("Elemento 1: " + element);
    }
    
}