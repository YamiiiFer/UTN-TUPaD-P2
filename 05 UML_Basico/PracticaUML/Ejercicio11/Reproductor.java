/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio11;
public class Reproductor {
    
     // Dependencia de uso: el método usa una Cancion como parámetro,
    // pero no la guarda como atributo.
    
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo()
                + " por " + cancion.getArtista().getNombre());
    }
}
