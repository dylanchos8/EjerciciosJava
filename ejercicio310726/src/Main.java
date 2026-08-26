import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre del cliente: " );
        String nombreCliente = scanner.nextLine();

        System.out.println("Nombre del producto: ");
        String nombreProducto = scanner.nextLine();

        System.out.println("Precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.println("cCantidad de producto/s: ");
        int cantidad = scanner.nextInt();

        Cliente cliente = new Cliente(nombreCliente);
        Producto producto = new Producto(nombreProducto, precio);
        Venta venta = new Venta(cliente, producto, cantidad);

        venta.mostrarDetalles();

        scanner.close();

    }
}
