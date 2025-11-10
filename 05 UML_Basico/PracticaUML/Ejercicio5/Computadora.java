/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;
public class Computadora {

    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;// Composición → La computadora "contiene" una placa madre
    private Propietario propietario;// Asociación bidireccional → Propietario ↔ Computadora

    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
    // Composición: se crea la PlacaMadre dentro del constructor
        this.placaMadre = new PlacaMadre(modelo, chipset);
    }
    public String getMarca() {
        return marca;
    }
    public String getNumeroSerie() {
        return numeroSerie;
    }
    public Propietario getPropietario() {
        return propietario;
    }
    public PlacaMadre getPlacaMadre() {
        return placaMadre;
    }
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }
}
