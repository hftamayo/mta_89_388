package refuerzo;

public class E09FormatDatos {
    public static void main(String[] args){
        double pi = Math.PI;
        System.out.format("Pi con 3 decimales %.3f%n", pi);
        System.out.format("Pi con 0 decimales %.0f%n", pi);        
        System.out.format("Pi con 9 decimales %.9f%n", pi);        
    }
    
}
