/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasoPractico1;

public enum CategoriaProducto {
    // Constantes del enum (cada una con su descripción asociada)
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electrónicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");
    
    // Atributo para guardar la descripción de cada categoría
    private final String descripcion;
    
    // Constructor (privado por defecto en los enum)
    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }
    
     // Método público para acceder a la descripción
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return name() + " (" + descripcion + ")";

    }
    
    
    
}

