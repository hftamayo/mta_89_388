package refuerzo;
/*
paso de varios parametros por medio de la linea de comandos
*/
public class E03ParamLineaComandos {
    public static void main(String args[]){  
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);    
        }  
    }  
}