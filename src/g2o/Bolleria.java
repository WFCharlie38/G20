package g2o;


public class Bolleria extends Producto
{
    private int azucar;
    private boolean descuento;

    /**********************************************************************************/
    
    public Bolleria(double precio, String nombre, int azucar) {
        super(precio, nombre);
        this.azucar = azucar;
    }
    
    public Bolleria(double precio, String nombre, int azucar, boolean descuento) {
        super(precio, nombre);
        this.azucar = azucar;
        this.descuento = descuento;
        comprobarDescuento();
    }
    
    /**********************************************************************************/
    
    public boolean isDescuento() {
        return descuento;
    }
    
    /**********************************************************************************/
    
    public void comprobarDescuento() {
        if (descuento) {
            double precio = getPrecio();
            double nuevoPrecio = precio - (precio * 0.15);
            setPrecio(nuevoPrecio);
        }
    }
    
}
