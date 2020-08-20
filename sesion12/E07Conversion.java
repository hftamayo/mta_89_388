package sesion12;

public class E07Conversion {
    public static void main(String[] args) {

        // tipos de datos primitivos
        int var1 = 5;
        double var2 = 5.65;
        boolean var3 = true;
    
        //conversion a tipos de datos extendidos
        Integer obj1 = Integer.valueOf(var1);
        Double obj2 = Double.valueOf(var2);
        Boolean obj3 = Boolean.valueOf(var3);
    
        //verificacion de los tipos de datos
        if(obj1 instanceof Integer) {
          System.out.println("Un objeto de la clase Integer fue creado.");
        }
    
        if(obj2 instanceof Double) {
          System.out.println("Un objeto de la clase Dobule fue creado.");
        }
    
        if(obj3 instanceof Boolean) {
          System.out.println("Un objeto de la clase Boolean fue creado");
        }
      }
    
}