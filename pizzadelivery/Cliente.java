/*
clase para controlar el perfil del cliente
*/

package pizzadelivery;

public class Cliente {

    private int codigoCliente;
    private String nombreCliente;
    private String apellidosCliente;
    private String telMovilCliente;

    public Cliente(int codigoCliente, String nombreCliente, String apellidosCliente, String telMovilCliente) {
        this.codigoCliente = codigoCliente;
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.telMovilCliente = telMovilCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public String getTelMovilCliente() {
        return telMovilCliente;
    }

    public void setTelMovilCliente(String telMovilCliente) {
        this.telMovilCliente = telMovilCliente;
    }   
}