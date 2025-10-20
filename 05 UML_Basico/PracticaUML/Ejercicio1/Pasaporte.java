/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

public class Pasaporte {
    //Atributos
    private String numero;
    private String fechaEmision;
    private Foto foto; //Composicion
    private Titular titular;//Asociacion bidireccional
    
    //Constructor

    public Pasaporte(String numero, String fechaEmision, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
    }
    // Getters y setters

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        titular.setPasaporte(this); // mantiene la bidireccionalidad
    }
    public void mostrarInfo() {
        System.out.println("Número: " + numero + ", Fecha de Emisión: " + fechaEmision);
        if (foto != null) {
            System.out.println("Formato foto: " + foto.getFormato());
        }
        if (titular != null) {
            System.out.println("Titular: " + titular.getNombre());
        }
    }
}