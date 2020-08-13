package sesion10;

class MultiE01 {

    public static void main(String[] args) {
        String[][] saludo = {
            {"Sr. ", "Sra. ", "Joven. "},
            {"Marquez", "Hernandez", "Fuentes"}
        };

        int [][] edades = {
            {15, 16, 12},
            {25, 35, 40, 22}
        };

        // Sr.
        System.out.println(saludo[0][0] + saludo[1][0]);
        //menor de edad
        System.out.println(edades[0][1]);  

        System.out.println(saludo[0][0] + saludo[1][2]);  
        //menor de edad
        System.out.println(edades[0][2]);  

        // Sra
        System.out.println(saludo[0][1] + saludo[1][0]);
        //mayor de edad
        System.out.println(edades[1][3]);  

        System.out.println(saludo[0][1] + saludo[1][1]);                
        //mayor de edad
        System.out.println(edades[1][0]);  
    }
}

