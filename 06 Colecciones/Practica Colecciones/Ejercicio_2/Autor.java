/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_2;

public class Autor {
    private String id;
    private String nombre;          //Atributos
    private String nacionalidad;
//Constructor
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
//Getters y Setters
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public String mostrarInfo(){
        return "Autor{id: "+id+
                            "\nnombre: "+nombre+
                            "\nnacionalidad: "+nacionalidad+
                            "}";
    }
}
