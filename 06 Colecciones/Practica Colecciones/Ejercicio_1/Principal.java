/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CasoPractico1;

public class Principal {

    public static void main(String[] args) {

        // 1. Creo el inventario
        Inventario inventario = new Inventario();

        // 2. Creo productos con diferentes categorías
        Producto p1 = new Producto("P001", "Guitarra Fender", 120000, 5, CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("P002", "Notebook Lenovo", 450000, 3, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Zapatillas Nike", 85000, 10, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Silla ergonómica", 95000, 4, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Pan integral", 110000, 8, CategoriaProducto.ALIMENTOS);

        // 3. Agrego al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // 🔎 Ahora probamos buscar un producto por ID
        System.out.println("\n--- BUSCAR PRODUCTO POR ID ---");

        Producto buscado = inventario.buscarProductoPorId("P002");

        if (buscado != null) {
            System.out.println("Producto encontrado:");
            buscado.mostrarInfo(); // usa el método mostrarInfo() de la clase Producto
        } else {
            System.out.println("No se encontró ningún producto con ese ID.");
        }

        // 4. Listo productos para verificar que se agregaron
        inventario.listarProductos();

        System.out.println("\n--- FILTRAR POR CATEGORÍA ---");
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        System.out.println("\n--- ELIMINAR PRODUCTO POR ID ---");
        inventario.eliminarProducto("P003");

        // Verificamos la lista actualizada
        System.out.println("\n--- LISTA ACTUALIZADA DE PRODUCTOS ---");
        inventario.listarProductos();

        System.out.println("\n--- ACTUALIZAR STOCK DE PRODUCTO ---");
        inventario.actualizarStock("P002", 12); // actualiza la cantidad de Notebook Lenovo

        // Verificamos el cambio
        System.out.println("\n--- LISTA ACTUALIZADA ---");
        inventario.listarProductos();

        System.out.println("\n--- TOTAL DE STOCK DISPONIBLE ---");
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("Total de unidades disponibles en inventario: " + totalStock);

        System.out.println("\n--- PRODUCTO CON MAYOR STOCK ---");
        Producto productoMayorStock = inventario.obtenerProductoConMayorStock();

        if (productoMayorStock != null) {
            System.out.println("El producto con mayor stock es:");
            productoMayorStock.mostrarInfo();
        } else {
            System.out.println("No hay productos en el inventario.");
        }

        System.out.println("\n--- FILTRAR PRODUCTOS POR PRECIO ---");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        System.out.println("\n--- MOSTRAR CATEGORÍAS DISPONIBLES ---");
        inventario.mostrarCategoriasDisponibles();

    }
}
