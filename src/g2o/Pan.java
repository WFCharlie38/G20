package g2o;


public class Pan extends Producto
{
    private String harina;
    
    /**********************************************************************************/

    public Pan(int precio, String nombre, String harina) {
        super(precio, nombre);
        this.harina = harina;
    }
    
}
