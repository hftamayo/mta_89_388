package sesion07;

public class Ejer04Iae {
   int m;
   public void setCalificaciones(int calificaciones) {
      if(calificaciones < 0 || calificaciones > 100)
         throw new IllegalArgumentException(Integer.toString(calificaciones));
      else
         m = calificaciones;
   }
   public static void main(String[] args) {
      Ejer04Iae s1 = new Ejer04Iae();
      s1.setCalificaciones(45);
      System.out.println(s1.m);
      Ejer04Iae s2 = new Ejer04Iae();
      s2.setCalificaciones(101);
      System.out.println(s2.m);
   }
}