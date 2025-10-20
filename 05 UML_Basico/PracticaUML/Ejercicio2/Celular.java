/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

public class Celular {
    // Atributos
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // agregación
    private Usuario usuario; // asociación bidireccional

    // Constructor
    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }

    // Getters y Setters
    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario.getCelular() != this) { // mantiene bidireccionalidad
            usuario.setCelular(this);
        }
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("IMEI: " + imei);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        if (bateria != null) {
            System.out.println("--- Información de la batería ---");
            bateria.mostrarInfo();
        }
        if (usuario != null) {
            System.out.println("--- Información del usuario ---");
            usuario.mostrarInfo();
        }
    }
}
