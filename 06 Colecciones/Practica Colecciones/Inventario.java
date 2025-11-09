/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico1;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos; //Esto representa la lista dinámica donde vas a guardar todos los productos del inventario.

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Agrega un nuevo producto al inventario, pero sin permitir duplicados con el mismo id.
    public void agregarProducto(Producto p) {
        // Primero verificamos si el producto ya existe
        for (Producto prod : productos) {
            if (prod.getId().equalsIgnoreCase(p.getId())) {
                System.out.println("❌ Ya existe un producto con el ID: " + p.getId());
                return; // salimos sin agregar
            }
        }
        // Si no se encontró duplicado, lo agregamos
        productos.add(p);
        System.out.println("✅ Producto agregado correctamente: " + p.getNombre());
    }

    // Metodos
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
            return;
        }

        System.out.println("\n LISTA DE PRODUCTOS EN INVENTARIO:");
        for (Producto p : productos) {
            p.mostrarInfo(); // usa el método mostrarInfo() de tu clase Producto
        }
    }

    public Producto buscarProductoPorId(String id) {
        // Recorremos la lista de productos
        for (Producto p : productos) {
            // Comparamos ignorando mayúsculas/minúsculas
            if (p.getId().equalsIgnoreCase(id)) {
                return p; // Si encontramos el producto, lo devolvemos
            }
        }
        // Si no se encontró ninguno, devolvemos null
        return null;
    }

    public void eliminarProducto(String id) {
    boolean eliminado = false;
    var iterator = productos.iterator();

    while (iterator.hasNext()) {
        Producto p = iterator.next();
        if (p.getId().equalsIgnoreCase(id)) {
            iterator.remove(); // forma segura de eliminar
            System.out.println(" Producto eliminado: " + p.getNombre());
            eliminado = true;
            break;
        }
    }

    if (!eliminado) {
        System.out.println(" No se encontró ningún producto con el ID: " + id);
    }
}
    public void actualizarStock(String id, int nuevaCantidad) {
    boolean actualizado = false;

    for (Producto p : productos) {
        if (p.getId().equalsIgnoreCase(id)) {
            p.setCantidad(nuevaCantidad);
            System.out.println("🔁 Stock actualizado para el producto: " + p.getNombre());
            System.out.println("   Nueva cantidad: " + nuevaCantidad);
            actualizado = true;
            break; // salimos porque ya lo actualizamos
        }
    }

    if (!actualizado) {
        System.out.println("No se encontró ningún producto con el ID: " + id);
    }
}

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        System.out.println("\n--- Productos en la categoría: " + categoria + " ---");
        boolean encontrado = false;

        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo(); // muestra la info del producto
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay productos en esta categoría.");
        }
    }

    public int obtenerTotalStock() {
    int total = 0;

    for (Producto p : productos) {
        total += p.getCantidad(); // sumamos la cantidad de cada producto
    }

    return total;
}

    public Producto obtenerProductoConMayorStock() {
    if (productos.isEmpty()) {
        return null; // si la lista está vacía, no hay producto
    }

    Producto mayorStock = productos.get(0); // asumimos que el primero es el mayor

    for (Producto p : productos) {
        if (p.getCantidad() > mayorStock.getCantidad()) {
            mayorStock = p; // si encontramos uno con más stock, lo actualizamos
        }
    }

    return mayorStock;
}

   public void filtrarProductosPorPrecio(double min, double max) {
    System.out.println("\n--- Productos con precio entre $" + min + " y $" + max + " ---");
    boolean encontrado = false;

    for (Producto p : productos) {
        if (p.getPrecio() >= min && p.getPrecio() <= max) {
            p.mostrarInfo();
            encontrado = true;
        }
    }

    if (!encontrado) {
        System.out.println(" No se encontraron productos en ese rango de precios.");
    }
}

    public void mostrarCategoriasDisponibles() {
    System.out.println("\n--- Categorías disponibles ---");
    for (CategoriaProducto c : CategoriaProducto.values()) {
        System.out.println(c.name() + " " + c.getDescripcion());
    }
}
}

