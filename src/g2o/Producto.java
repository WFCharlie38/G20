package g2o;


public class Producto 
{
    private int codigo;
    private static int codigoTotal=9;
    private int precio;
    private String nombre;
    private static int total;
    
    /**********************************************************************************/

    public Producto(int codigo, int precio, String nombre) {
        this.codigo = codigoTotal++;
        this.precio = precio;
        this.nombre = nombre;
    }
    
}
