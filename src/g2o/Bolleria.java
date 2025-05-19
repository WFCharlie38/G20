package g2o;


public class Bolleria extends Producto
{
    private int azucar;
    private boolean descuento;

    /**********************************************************************************/
    
    public Bolleria(int azucar, boolean descuento, int codigo, int precio, String nombre) {
        super(codigo, precio, nombre);
        this.azucar = azucar;
        this.descuento = descuento;
    }
    
}
