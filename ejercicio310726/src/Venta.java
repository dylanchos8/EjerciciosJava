public class Venta {
    private Cliente cliente;
    private Producto producto;
    private int cantidad;

    public Venta(Cliente cliente, Producto producto, int cantidad){
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularTotal(){
        double total = producto.getPrecio() * cantidad;

        if (total > 100) {
            total = total * 0.90;
        }

        return total;

    }

    public void mostrarDetalles(){
        System.out.println("\n----Detalle de la venta----");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
        System.out.println("Cantidad: " + cantidad);

        double subtotal = producto.getPrecio() * cantidad;
        System.out.println("Subtotal: $" + subtotal);

        if(subtotal > 100){
            System.out.println("su compra supera los $100: Descuento del 10% aplicado");
        }

        System.out.println("Total de su compra: $" + calcularTotal() );
    }

}
