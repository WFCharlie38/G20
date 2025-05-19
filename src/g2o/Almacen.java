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
    
    /**********************************************************************************/
    
    public void agregarProducto(Producto producto) {
        
        for (int i = 0; i < almacen.length; i++) {
            for (int j = 0; j < almacen[1].length; j++) {
                if (almacen[i][j] != null) {
                    almacen[i][j] = producto;
                }
            }
        }
    }
    
    /**********************************************************************************/
    
    public void calcularPrecioTotal() {
        int precio=0;
        
        for (int i = 0; i < almacen.length; i++) {
            for (int j = 0; j < almacen[1].length; j++) {
                if (almacen[i][j] != null) {
                    precio+= almacen[i][j].getPrecio();
                }
            }
        }
        
        System.out.println("El precio de todos los productos es: "+precio);
    }
    
    /**********************************************************************************/
    
    public void caluclarPrecioProducto(String nombre) {
        int precio=0;
        
        for (int i = 0; i < almacen.length; i++) {
            for (int j = 0; j < almacen[1].length; j++) {
                if (almacen[i][j] != null && almacen[i][j].getNombre().equalsIgnoreCase(nombre)) {
                    precio+= almacen[i][j].getPrecio();
                }
            }
        }
        
        System.out.println("El precio de todos los productos con el nombre "+nombre+" es: "+precio);
    }
    
}
