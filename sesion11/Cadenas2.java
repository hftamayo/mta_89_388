package sesion11;

class OperacionesArchivo {
    private String rutaCompleta;
    private char caracterSeparador, 
                 extensionSeparador;

    public OperacionesArchivo(String str, char sep, char ext) {
        rutaCompleta = str;
        caracterSeparador = sep;
        extensionSeparador = ext;
    }

    //lastIndexOf = devuelve la posicion de la coincidencia de un caracter en especifico

    public String extension() {
        int dot = rutaCompleta.lastIndexOf(extensionSeparador);
        return rutaCompleta.substring(dot + 1);
    }

    // gets filename without extension
    public String filename() {
        int dot = rutaCompleta.lastIndexOf(extensionSeparador);
        int sep = rutaCompleta.lastIndexOf(caracterSeparador);
        return rutaCompleta.substring(sep + 1, dot);
    }

    public String path() {
        int sep = rutaCompleta.lastIndexOf(caracterSeparador);
        return rutaCompleta.substring(0, sep);
    }
}


public class Cadenas2 {
    public static void main(String[] args) {
        final String FPATH = "/c/documentos/java/cadenas.java";
        OperacionesArchivo archivo = new OperacionesArchivo(FPATH, '/', '.');
        System.out.println("Ruta completa: "+FPATH);
        System.out.println("Extension = " + archivo.extension());
        System.out.println("Nombre del archivo = " + archivo.filename());
        System.out.println("ruta = " + archivo.path());
    }   
}