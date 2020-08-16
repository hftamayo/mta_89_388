package sesion11;

public class Cadenas3 {
    public static void main(String[] args) {
        String textoPrincipal = "Carne Huevos Leche y Vegentales";
        String buscarPalabra = "CARNEHUEVOS";
        System.out.println("Cadena de texto principal: "+ textoPrincipal);
        System.out.println("Palabra a buscar: "+ buscarPalabra);        

        int longitudTextoPrincipal = textoPrincipal.length();
        int longitudBuscarPalabra = buscarPalabra.length();
        boolean palabraEncontrada = false;
        //evalua si una porcion de una cadena coincide con un argumento
        for (int i = 0; 
             i <= (longitudTextoPrincipal - longitudBuscarPalabra);
             i++) {
           if (textoPrincipal.regionMatches(i, buscarPalabra, 0, longitudBuscarPalabra)) {
              palabraEncontrada = true;
              System.out.println("Resultado de la busqueda: "+textoPrincipal.substring(i, i + longitudBuscarPalabra));
              break;
           }
        }//FIN DE LA ESTRUCTURA DE CONTROL FOR
        if (!palabraEncontrada)
            System.out.println("No se encontraron coincidencias.");
    }
    
}