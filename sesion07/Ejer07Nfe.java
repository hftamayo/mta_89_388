package sesion07;

public class Ejer07Nfe
{

   public static void main(String[] args)
{

   try


{


   String s = "saurabh";


   int i = Integer.parseInt(s);


  // por que nunca se llega a esta linea//


   System.out.println("valor entero = " + i);
}


   catch (NumberFormatException nfe)


{
 

  nfe.printStackTrace();
}


}

}