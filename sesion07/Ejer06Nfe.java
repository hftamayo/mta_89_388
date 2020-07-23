package sesion07;

public class Ejer06Nfe {

    public static void main(String[] args) {

        String str1 = "100ABCD";
        try {
            int x = Integer.parseInt(str1); // Converting string with inappropriate format
            int y = Integer.valueOf(str1);
        } catch (NumberFormatException e) {
            System.err.println("NumberFormatException detectada!");
            e.printStackTrace();
        }
    }
}