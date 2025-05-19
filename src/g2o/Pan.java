package g2o;


public class Pan extends Producto
{
    private String harina;
    
    /**********************************************************************************/

    public Pan(int codigo, int precio, String nombre, String harina) {
        super(codigo, precio, nombre);
        this.harina = harina;
    }
    
}
