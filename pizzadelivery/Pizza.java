package pizzadelivery;

import java.util.Scanner;

 public class Pizza extends Menu{
    //propiedades especificas de Pizza
    //3. se necesita que por cada instancia sea asignada
    //un nuevo codigo con el objetivo de mantener la integridad
    //de los datos
    private int codigoPizza;
    private String ingredientesPizza;
    private String tipoMasaPizza;
    private String totalCaloriasPizza;
    private String tipoOrillaPizza;
    private String tipoFormaPizza;
    private String mitadUnadeDosPizza;
    private String mitadDosdeDosPizza;

    /*
    1. definir el constructor de cada clase hija
    2. definir como podemos capturar los datos de cada especialidad despues de haber
    ingresado datos del menu
    3. Validar la posibilidad si necesitamos usar una propiedad odigo para cada instancia 
    de clase hija
    */

    //1. definir el constructor de la clase

    public Pizza(){
        //2. los datos seran capturados cuando se decida crear
        //una instancia de la clase Pizza
        capturaDatos();
    }//fin del constructor

    //15-07: AGREGAR METODOS GET Y SET

    public void capturaDatos(){
        //variable de metodo
        Scanner entradaTeclado = new Scanner(System.in);
                
        System.out.println("=============================");
        System.out.println("Proceso de captura de datos de nueva" +
        "especialidad de Pizza");
        System.out.println("=============================");
        
        System.out.println("Digite el codigo de espec de Pizza:");
        this.setCodigoPizza(entradaTeclado.nextLine());

        System.out.println("Digite los ingredientes Pizza:");
        this.setIngredientesPizza(entradaTeclado.nextLine());

        //tecnica para capturar la entrada de datos a la par
        //de la pregunta
        System.out.print("Digite el tipo de masa de Pizza: ");
        this.setMasaPizza(entradaTeclado.nextLine());

        System.out.print("Digite total de calorias Pizza: ");
        this.setTotalCaloriasPizza(entradaTeclado.nextLine());

        System.out.print("Digite tipo Orilla Pizza: ");
        this.setTipoOrillaPizza(entradaTeclado.nextLine());

        System.out.print("Digite forma de la Pizza: ");
        this.setTipoFormaPizza(entradaTeclado.nextLine());

        System.out.print("Digite primera mitad combinacion Pizza: ");
        this.setMitadUnadeDosPizza(entradaTeclado.nextLine());

        System.out.print("Digite segunda mitad combinacion Pizza: ");
        this.setMitadUnadeDosPizza(entradaTeclado.nextLine());

        System.out.println("Los datos se han terminado de capturar");
        System.out.println("--------------------------------------");
    }//fin de captura de datos
    
}