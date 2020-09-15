package refuerzo;

public class E08TiposDatos {
    public static void main(String[] args){
        char data1 = 65;
        System.out.println("tipo de datos char: " + data1);

        long data2 = 65;
        System.out.println("tipo de datos long: " + data2);

        float data3 = new Float("-65");
        System.out.println("tipo de datos float: " + data3);

        short data4 = Short.parseShort("65.0");
        System.out.println("tipo de datos short: " + data4);


    }
    
}
