/*
codigo para limpiar pantalla, funciona en Windows, Linux y Mac

por que la clase debe ser final y void?
*/

public class LimpiarPantalla(){

        public final static void LimpiarPantalla()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
}

