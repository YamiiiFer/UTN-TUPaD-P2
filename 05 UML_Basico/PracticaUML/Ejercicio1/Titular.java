/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

public class Titular {

   private String nombre;
   private String dni;
   private Pasaporte pasaporte; // asociación bidireccional
  
   
   //Constructor
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", DNI: " + dni);
        if (pasaporte != null) {
            System.out.println("Pasaporte asociado: " + pasaporte.getNumero());
        }
    }
}
