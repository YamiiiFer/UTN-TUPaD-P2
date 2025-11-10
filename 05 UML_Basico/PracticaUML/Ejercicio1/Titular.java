/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;
public class Titular {
    
    //ATRIBUTOS
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; 
    
    //CONSTRUCTOR
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    // Getters y Setters
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
    //Relación bidireccional con Pasaporte
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }

}
