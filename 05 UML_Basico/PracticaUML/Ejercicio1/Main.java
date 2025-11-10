/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;
public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Yamila Fernandez", "39854714");
        Pasaporte pasaporte = new Pasaporte("AB123456", "2025-05-25", "foto.jpg", "JPEG");
        titular.setPasaporte(pasaporte);
        System.out.println("Pasaporte número: " + pasaporte.getNumero());
        System.out.println("Titular: " + pasaporte.getTitular().getNombre());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen());
    }
    
}
