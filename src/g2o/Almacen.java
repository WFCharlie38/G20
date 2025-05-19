package g2o;


public class Almacen 
{
    private Producto [][] almacen;
    private int estanerias;
    private int filas;
    
    /**********************************************************************************/

    public Almacen(int estanerias, int filas) {
        this.estanerias = estanerias;
        this.filas = filas;
        almacen = new Producto[estanerias][filas];
    }
    
}
