package sesion11;
import java.text.DecimalFormat;

public class Conversion1 {
    public static void main(String args[]) 
  { 
    int a = 400; 
    int b = 100;
    
    System.out.println("Las variables en formato numero son: "+a+" y: "+b);
    System.out.println("La sumatoria de ambas es: "+(a+b));
    
    String str1 = Integer.toString(a); 
    String str2 = Integer.toString(b); 
    System.out.println("La variable 1 en formato cadena es: " + str1);  
    System.out.println("La variable 2 en formato cadena es:  " + str2);
    System.out.println("La sumatoria de ambas es: "+(str1+str2));
    
    //
    int c = 1234; 
    int c1 = 500;
    String str3 = String.valueOf(c); 
    String str31 = String.valueOf(c1);
    System.out.println("Representacion en caracter de un var numerica = " + str3); 
    System.out.println("Suma de 2 variables numericas rep en caracter: " +(str3+str31));
    
    //
    int d = 1234; 
    Integer obj = new Integer(d); 
    String str4 = obj.toString(); 
    System.out.println("String str4 = " + str4); 

    //
    int d1 = 1234; 
    String str5 = new Integer(d1).toString(); 
    System.out.println("String str5 = " + str5); 

    //
    double e = 1234575.25; 
    DecimalFormat df = new DecimalFormat("#,###.##"); 
    String Str5 = df.format(e); 
    System.out.println(Str5); 

    //
    int f = 1234; 
    StringBuffer sb = new StringBuffer(); 
    sb.append(f); 
    String str6 = sb.toString(); 
    System.out.println("String str6 = " + str6); 

  } 
}