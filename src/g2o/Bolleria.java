package g2o;


public class Bolleria extends Producto
{
    private int azucar;
    private boolean descuento;

    /**********************************************************************************/
    
    public Bolleria(int precio, String nombre, int azucar, boolean descuento) {
        super(precio, nombre);
        this.azucar = azucar;
        this.descuento = descuento;
    }
    
}
