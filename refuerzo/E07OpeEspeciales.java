package refuerzo;

public class E07OpeEspeciales {
    public static void main(String[] args){
        /*
        Data Type 	valores
        byte 	0
        short 	0
        int 	0
        long 	0L
        float 	0.0f
        double 	0.0d
        char 	'\u0000'
        String (o cualquier objeto)  null
        boolean 	false
        */
        double numero = 27;
        numero %= -3d; //valor en formato doble
        System.out.println("Resultado del modulo del numero: " + numero);
        numero += 10f; //valor en formato doble
        System.out.println("Resultado de suma numero: " + numero);
        numero *= -4; //formato int
        System.out.println("Resultado de la multiplicacion numero: " + numero);        
    }
    
}
