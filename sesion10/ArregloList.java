package sesion10;

import java.util.ArrayList;

class ArregloList {
    public static void main(String[] args){
        ArrayList<String> frutas = new ArrayList<>();
        ArrayList<String> animales = new ArrayList<>();        

        //agregar elementos
        frutas.add("Manzana");
        frutas.add("Limon");
        frutas.add("Sandia");
        System.out.println("frutas: " + frutas);

        animales.add(0, "perro");
        animales.add(1, "conejo");
        animales.add(2, "tortuga");
        System.out.println("animales: " + animales);
        ArrayList<String> animvegetal = new ArrayList<>();        
        animvegetal.add("gato");
        animvegetal.addAll(animales);
        animvegetal.addAll(frutas);
        System.out.println("Reino Animal y Vegental: " + animvegetal);
        //agregar un nuevo elemento
    }
}
