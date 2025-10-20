/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;
/**
 * Clase Mascota
 * 
 * Representa a una mascota con nombre, especie y edad.
 * Demuestra encapsulamiento con atributos privados,
 * getters y setters, y métodos para mostrar información
 * y simular que la mascota cumple años.
 */
public class Mascota {
    
    // Atributos (estado del objeto)
    private String nombre;
    private String especie;
    private int edad;
    
    // Constructor vacío (vamos a usar setters para cargar los datos)
    public Mascota() { }
    
        // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if (edad < 0) {
            edad = 0; // no permitimos edades negativas
        }
        this.edad = edad;
    }
    
     // Métodos de comportamiento
    // -----------------------------

    /**
     * Muestra la información de la mascota.
     */
     public void mostrarInfo() {
        System.out.printf("Mascota: %s | Especie: %s | Edad: %d años%n",
                          nombre, especie, edad);
    }
     
     /**
     * Incrementa la edad de la mascota en 1.
     */
    public void cumplirAnios() {
        this.edad += 1; 
        System.out.println(nombre + " cumplió un año más 🎉 Ahora tiene " + edad + " años.");
    }
     
}
