/*
controla todas las opciones del menu disponible
*/

package pizzadelivery;

import java.util.Scanner;

public class Menu {
    /*
    ejemplo de variable estatica que sera usada por un metodo estatico de clase
    */
    private static Double descuentoPermitido = 0.15;


    private int codigoEspecialidad;
    private String nombreEspecialidad;
    private String descripcionEspecialidad;
    protected float precioEspecialidad;
    private String tamanoEspecialidad;

    public Menu(int codigoEspecialidad, String nombreEspecialidad, String descripcionEspecialidad,
            float precioEspecialidad, String tamanoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
        this.nombreEspecialidad = nombreEspecialidad;
        this.descripcionEspecialidad = descripcionEspecialidad;
        this.precioEspecialidad = precioEspecialidad;
        this.tamanoEspecialidad = tamanoEspecialidad;
    }

    //sobrecarga del constructor
    public Menu(){
        capturaDatos();
    }

    public int getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(int codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public String getDescripcionEspecialidad() {
        return descripcionEspecialidad;
    }

    public void setDescripcionEspecialidad(String descripcionEspecialidad) {
        this.descripcionEspecialidad = descripcionEspecialidad;
    }

    public float getPrecioEspecialidad() {
        return precioEspecialidad;
    }

    public void setPrecioEspecialidad(float precioEspecialidad) {
        this.precioEspecialidad = precioEspecialidad;
    }

    public String getTamanoEspecialidad() {
        return tamanoEspecialidad;
    }

    public void setTamanoEspecialidad(String tamanoEspecialidad) {
        this.tamanoEspecialidad = tamanoEspecialidad;
    }

    public final void capturaDatos(){
        //gestiona el proceso de entrada de datos de un nuevo cliente
        //definir la variable entradaTeclado como variable de metodo
        //puesto que en ninguna otra parte de la clase se va a requerir usarse
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Proceso para captura de datos de una nueva especialidad:");
        
        System.out.println("Por favor digite el codigo de la especialidad: ");
        this.setCodigoEspecialidad(Integer.parseInt(entradaTeclado.nextLine()));

        System.out.println("Por favor digite el nombre de la especialidad: ");        
        this.setNombreEspecialidad(entradaTeclado.nextLine());

        System.out.println("Por favor digite la descripcion de la Especialiad: ");        
        this.setDescripcionEspecialidad(entradaTeclado.nextLine());

        System.out.println("Por favor digite el precio de la especialidad: ");        
        this.setPrecioEspecialidad(Float.parseFloat(entradaTeclado.nextLine()));

        System.out.println("Por favor digite el tamano de la especialidad: ");        
        this.setTamanoEspecialidad(entradaTeclado.nextLine());        
        System.out.println("------------------------------------------------------");
        System.out.println();

        //es muy importante cerrar los objetos Scanner una vez que han dejado de usarse
        entradaTeclado.close();
    }   //fin del metodo capturaDatos

    private static hacerEfectivoDescuento(descuentoPermitido){
        if(this.getPrecioEspecialidad > 20){
            descuentoPermitido = 0.25;
            //calcular monto a pagar
        }
        else{
            //calcularmonto a pagar con el descuento estandar

        }
    }
}