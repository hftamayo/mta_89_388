/*
controla todas las opciones del menu disponible
*/

package pizzadelivery;


public class Menu {
    private int codigoEspecialidad;
    private String nombreEspecialidad;
    private String descripcionEspecialidad;
    private float precioEspecialidad;
    private String tamanoEspecialidad;

    public Menu(int codigoEspecialidad, String nombreEspecialidad, String descripcionEspecialidad,
            float precioEspecialidad, String tamanoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
        this.nombreEspecialidad = nombreEspecialidad;
        this.descripcionEspecialidad = descripcionEspecialidad;
        this.precioEspecialidad = precioEspecialidad;
        this.tamanoEspecialidad = tamanoEspecialidad;
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
}