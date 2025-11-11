/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico1;

public class Producto {
    private String id; //Identificador único del producto
    private String nombre; //Nombre del producto
    private double precio; // Precio del Producto
    private int cantidad; //Cantidad en stock
    private CategoriaProducto categoria; // Categoría del producto

    // Constructor
    public Producto(String id, String nombre, double precio, int catidad, CategoriaProducto categoria) {
        if (id == null || id.isEmpty()) throw new IllegalArgumentException("id no puede ser vacío");
        if (precio < 0) throw new IllegalArgumentException("precio no puede ser negativo");
        if (cantidad < 0) throw new IllegalArgumentException("cantidad no puede ser negativa");

        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = catidad;
        this.categoria = categoria;   
    }
    // Getters y Setters
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        if (precio < 0) throw new IllegalArgumentException("precio no puede ser negativo");
        this.precio = precio;
    }
    public int getCantidad() { 
        return cantidad; 
    }
    public void setCantidad(int cantidad) {
        if (cantidad < 0) throw new IllegalArgumentException("cantidad no puede ser negativa");
        this.cantidad = cantidad;
    }
    public CategoriaProducto getCategoria() { 
        return categoria;
    }
    public void setCategoria(CategoriaProducto categoria) { 
        this.categoria = categoria; 
    }
    // Método para mostrar info en consola
    public void mostrarInfo() {
        System.out.printf("ID: %s | Nombre: %s | Categoria: %s | Precio: %.2f | Cantidad: %d%n",
                          id, nombre, categoria, precio, cantidad);
    }
    
    
}
