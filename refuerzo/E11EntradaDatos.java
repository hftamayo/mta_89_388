package refuerzo;
import java.util.Scanner;

public class E11EntradaDatos {
    public static void main(String[] args){
        System.out.println("Ingrese fecha en MMDDYYYY");
        Scanner sc = new Scanner(System.in);
        String fechaCumple = sc.next();
        sc.close();
        System.out.println(fechaCumple);
    }
    
}
