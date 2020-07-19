package pizzadelivery;

import java.util.Scanner;

public class Pastas extends Menu{

    private int codigoPasta;
    private String ingredientesPasta;
    private String formaPasta; //spaguetti, lasagna, canelones
    private String tipoSalsaPasta;
    private String totalCaloriasPasta;
    private String tipoQuesosDisponiblesPasta;

    public Pastas(){
        capturaDatos();
    }

    public int getCodigoPasta(){
        return codigoPasta;
    }

    public void setCodigoPasta(int codigoPasta){
        this.codigoPasta = codigoPasta;
    }


    public String getIngredientesPasta() {
        return ingredientesPasta;
    }

    public void setIngredientesPasta(String ingredientesPasta) {
        this.ingredientesPasta = ingredientesPasta;
    }

    public String getFormaPasta() {
        return formaPasta;
    }

    public void setFormaPasta(String formaPasta) {
        this.formaPasta = formaPasta;
    }

    public String getTipoSalsaPasta() {
        return tipoSalsaPasta;
    }

    public void setTipoSalsaPasta(String tipoSalsaPasta) {
        this.tipoSalsaPasta = tipoSalsaPasta;
    }

    public String getTotalCaloriasPasta() {
        return totalCaloriasPasta;
    }

    public void setTotalCaloriasPasta(String totalCaloriasPasta) {
        this.totalCaloriasPasta = totalCaloriasPasta;
    }

    public String getTipoQuesosDisponiblesPasta() {
        return tipoQuesosDisponiblesPasta;
    }

    public void setTipoQuesosDisponiblesPasta(String tipoQuesosDisponiblesPasta) {
        this.tipoQuesosDisponiblesPasta = tipoQuesosDisponiblesPasta;
    }

    
    //overriding del metodo capturaDatos que pertenece a Menu.java
    public void capturaDatos(){
        System.out.println("===========================================");
        System.out.println("Agregacion de datos de Especialidad: Pasta");
        System.out.println("===========================================");

        // mucho ojo con este nuevo objeto Scanner
        Scanner entradaTeclado1 = new Scanner(System.in);
        System.out.println("Digite los ingredientes de la pasta separados por comas: ");
        this.setIngredientesPasta(entradaTeclado1.nextLine());

        System.out.println("Digite los tipos de pasta disponibles: ");
        this.setFormaPasta(entradaTeclado1.nextLine());

        System.out.println("Digite los tipos de salsa disponibles: ");
        this.setTipoSalsaPasta(entradaTeclado1.nextLine());

        System.out.println("Digite los tipos de quesos disponibles: ");        
        this.setTipoQuesosDisponiblesPasta(entradaTeclado1.nextLine());

        System.out.println("Digite las calorias total del plato: ");        
        this.setTotalCaloriasPasta(entradaTeclado1.nextLine());

        System.out.println("Se finalizo de capturar datos de la Pasta: ");
        System.out.println("------------------------------------------------------");
        System.out.println();

        entradaTeclado1.close();


    }//fin del metodo sobreescrito de capturaDatos

    /*POR HACER 
    codifique un metodo que despues de haber digitado los datos de la pasta
    muestre toda la informacion relacionada entre la clase menu y pasta
    */


}