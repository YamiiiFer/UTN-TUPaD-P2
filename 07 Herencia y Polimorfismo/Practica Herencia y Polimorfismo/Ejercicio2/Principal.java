/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;
// ----- Main -----
public class Principal {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo(3),
            new Rectangulo(4, 2)
        };

        // Polimorfismo: se llama al método correspondiente según el objeto real
        for (Figura f : figuras) {
            System.out.println("Área de " + f.nombre + ": " + f.calcularArea());
        }
    }
}
