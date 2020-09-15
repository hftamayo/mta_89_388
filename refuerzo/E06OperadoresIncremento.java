package refuerzo;

public class E06OperadoresIncremento {
    public static void main(String args[]){
        int a = 5;
        int b = 10;
        int c = ++a * b--;
        System.out.println("primera operacion: " + c);
        int d = a-- + ++b;
        System.out.println("segunda operacion: " + d);
    }
    
}
