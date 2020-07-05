/*
Lineas: catalogo para registrar las distintas
lineas en las cuales los productos son ordenados
autor: htamayo
fecha creacion: 5/7/2020
comentarios
*/

public class Lineas{

    //1. propiedades
    int codigoLinea;
    String nombreLinea;
    String descripcionLinea;
    int estadoLinea;
    
    //2. metodo constructor
    public Lineas(int codigo, String nombre, String descripcion, int estado){
        setCodigoLinea(codigo);
        setNombreLinea(nombre);
        setDescripcionLinea(descripcion);
        setEstadoLinea(estado);
    }//fin del constructor
    
    //sobrecarga del constructor: mayor ampliacion en sesion 8
    public Lineas(String nombre){
        setNombreLinea(nombre);
    }

    //3. metodos setters
    public void setCodigoLinea(int xcodigo){
        this.codigoLinea = xcodigo;
    }

    public void setNombreLinea(String xnombre){
        this.nombreLinea = xnombre;
    }    

    public void setDescripcionLinea(String descripcion){
        this.descripcionLinea = descripcion;
    }        
    
    public void setEstadoLinea(int estado){
        this.estadoLinea = estado;
    }    
    
    //4. metodos getters
    public int getCodigoLinea(){
        return this.codigoLinea;
    }

    public String getNombreLinea(){
        return this.nombreLinea;
    }    
    
    public String getDescripcionLinea(){
        return this.descripcionLinea;
    }        

    public int getEstadoLinea(){
        return this.estadoLinea;
    }            
    
    
} //fin de la clase medida
