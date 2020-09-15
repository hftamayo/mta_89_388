package refuerzo;

import java.util.Scanner;

public class E10EntradaDatos {
    public static void main(String[] args){
        Scanner sc = new Scanner("1 Excelente 2 Bueno 3 Regular 4 Mal");
        Object data1 = sc.next();
        System.out.println(data1);
        Object data2 = sc.next();
        System.out.println(data2);        
        Object data3 = sc.nextInt();
        System.out.println(data3);        
        Object data4 = sc.nextLine();
        System.out.println(data4);        
    }
}
