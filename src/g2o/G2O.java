package g2o;

import java.util.Scanner;


public class G2O 
{

    
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int estanterias;
        int filas;
        
        System.out.println("Introduce el número de estanterías");
        estanterias = entrada.nextInt();
        
        System.out.println("Introduce el número de filas");
        filas = entrada.nextInt();
        
        
        Almacen almacen = new Almacen(estanterias ,filas);
        
        operacionesProductos(almacen);
    }
    
    private static void operacionesProductos(Almacen almacen) {
        Scanner entrada = new Scanner(System.in);
        Producto producto;
        String nombre;
        int estanteria;
        int  codigo;
        
        producto = new Pan(1.1, "pan de molde", "maiz");
        almacen.agregarProducto(producto);
        
        producto = new Bolleria(1.5, "bollycao", 0);
        almacen.agregarProducto(producto);
        
        producto = new Pan(1.1, "pan de molde", "trigo");
        almacen.agregarProducto(producto);
        
        producto = new Bolleria(3.75, "croissants", 0, true);
        almacen.agregarProducto(producto);
        
        producto = new Bolleria(1.5, "bollycao", 0, true);
        almacen.agregarProducto(producto);
        
        System.out.println("");
        
        almacen.calcularPrecioTotal();
        
        System.out.println("");
        
        System.out.print("Inroduce el nombre del producto que quieres caluclar el total: ");
        nombre = entrada.nextLine();
        
        almacen.caluclarPrecioProducto(nombre);
        
        System.out.println("");
        
        System.out.print("Inroduce el numero de la estanteria que quieres calcular el total: ");
        estanteria = entrada.nextInt();
        
        almacen.calcularPrecioTotalEstanteria(estanteria);
        
        System.out.println("");
        
        System.out.print("Inroduce el codigo del producto que quieres eliminar: ");
        codigo = entrada.nextInt();
        
        almacen.eliminarProducto(codigo);
        
        producto = new Bolleria(3.75, "croissants", 0);
        almacen.agregarProducto(producto);
        
        System.out.println("");
        
        almacen.mostrarInformacion();
        
        System.out.println("Total de productos actuales: "+Producto.getTotal());
    }

}
