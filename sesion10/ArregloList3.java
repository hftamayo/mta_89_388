package sesion10;
import java.util.ArrayList;
import java.util.Iterator;

public class ArregloList3 {
    public static void main(String[] args){
        ArrayList<String> animales = new ArrayList<>();
        animales.add("Perro");
        animales.add("Gato");
        animales.add("Perico");
        animales.add("Iguana");
        animales.add("Tortuga");

        Iterator<String> iteracion = animales.iterator();
        System.out.print("Reino animal: ");

        while(iteracion.hasNext()){
            System.out.println(iteracion.next());
        }
    }    
}