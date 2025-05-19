package g2o;


public class Pan extends Producto
{
    private String harina;
    
    /**********************************************************************************/

    public Pan(double precio, String nombre, String harina) {
        super(precio, nombre);
        this.harina = harina;
    }
    
}
