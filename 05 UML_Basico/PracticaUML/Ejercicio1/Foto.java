/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

public class Foto {
    private String nombre;
    private String formato;
    
    //Constructor

    public Foto(String nombre, String formato) {
        this.nombre = nombre;
        this.formato = formato;
    }
    // Getters y setters

    public String getNombre() {
        return nombre;
    }
    public void setImagen(String nombre) {
        this.nombre = nombre;
    }

    public String getFormato() {
        return formato;
    }
    public void setFormato(String formato) {
        this.formato = formato;
    }
    public void mostrarInfo(){
        System.out.println("Nombre de la imagen: " + nombre + ", Formato: " + formato);
    }
    
}
