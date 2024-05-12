import java.util.Scanner;

public class App {

    public static void buscarProducto(String[] productos,String producto) {
        boolean encontrado = false;
        for (int i = 0; i < productos.length; i++) {
            // si el producto esta en la lista establecer "encontrado" en true
            if (productos[i].equalsIgnoreCase(producto)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("El producto esta disponible");
        } else{
            System.out.println("El producto no esta disponible");
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner input = new Scanner(System.in);

        System.out.println("Cuantos productos quieres agregar?");
        int nproductos = input.nextInt();
        input.nextLine();

        String[] productos = new String[nproductos];
        for (int i = 0; i < nproductos; i++) {
            System.out.println("Ingresa el producto "+(i+1)+":");
            String producto = input.nextLine();
            productos[i]=producto;
        }

        try {
            System.out.println("Que producto quieres buscar?");
            String productoABuscar = input.nextLine();
            buscarProducto(productos, productoABuscar);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Ingresa un valor string");
        }
        input.close();
    }
}