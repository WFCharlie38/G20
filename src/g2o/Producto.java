package g2o;


public class Producto 
{
    private int codigo;
    private static int codigoTotal=9;
    private double precio;
    private String nombre;
    private static int total=0;
    
    /**********************************************************************************/

    public Producto(double precio, String nombre) {
        this.codigo = codigoTotal++;
        this.precio = precio;
        this.nombre = nombre;
        total++;
        calcularDescuento();
    }
    
    /**********************************************************************************/
    
    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public static int getTotal() {
        return total;
    }
    
    
    /**********************************************************************************/

    public static void restarTotal() {
        total--;
    }
    
    /**********************************************************************************/

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    /**********************************************************************************/
    
    public void calcularDescuento() {
        this.calcularDescuento();
    }
    
    /**********************************************************************************/
    
    public void mostrarInfo() {
        System.out.println("Código: "+codigo+", precio= "+precio+", nombre= "+nombre);
    }
    
}
