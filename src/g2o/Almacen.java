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
        int i=0;
        int j=0;
        boolean puesto=false;
        
        while (j < almacen[1].length && !puesto) {
            while (i < almacen.length && !puesto) {
                if (almacen[i][j] == null) {
                    almacen[i][j] = producto;
                    puesto = true;
                    System.out.println("Producto insertado: "+producto.getNombre()+" En la estantería "+(j)+" y fila "+(i)+" precio: "+producto.getPrecio()+" código: "+producto.getCodigo());
                }
                i++;
            }
            j++;
            i=0;
        }
    }
    
    /**********************************************************************************/
    
    public void calcularPrecioTotal() {
        double precio=0;
        
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
        double precio=0;
        
        for (int i = 0; i < almacen.length; i++) {
            for (int j = 0; j < almacen[1].length; j++) {
                if (almacen[i][j] != null && almacen[i][j].getNombre().equalsIgnoreCase(nombre)) {
                    precio+= almacen[i][j].getPrecio();
                }
            }
        }
        
        System.out.println("El precio de todos los productos con el nombre "+nombre+" es: "+precio);
    }
    
    /**********************************************************************************/
    
    public void calcularPrecioTotalEstanteria(int estanteria) {
        double precio=0;
        
         for (int i = 0; i < almacen[1].length; i++) {
             if (almacen[i][estanteria] != null) {
                    precio+= almacen[i][estanteria].getPrecio();
             }
         }
        
        System.out.println("El precio de todos los productos de la estantería "+estanteria+" es: "+precio);
    }
    
    /**********************************************************************************/
    
    public void eliminarProducto(int codigo) {
        for (int j = 0; j < almacen.length; j++) {
            for (int i = 0; i < almacen[1].length; i++) {
                if (almacen[i][j] != null && almacen[i][j].getCodigo() == codigo) {
                    almacen[i][j] = null;
                }
            }
        }
        Producto.restarTotal();
        System.out.println("Producto eliminado");
    }
    
    /**********************************************************************************/
    
    public void mostrarInformacion() {
        for (int j = 0; j < almacen.length; j++) {
            for (int i = 0; i < almacen[1].length; i++) {
                if (almacen[i][j] != null) {
                    almacen[i][j].mostrarInfo();
                }
            }
        }
    }
    
}
