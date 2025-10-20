/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        // 1) Crear objeto Mascota
        Mascota miMascota = new Mascota();

        // 2) Asignar valores con setters
        miMascota.setNombre("Luna");
        miMascota.setEspecie("Perro");
        miMascota.setEdad(3);

        // 3) Mostrar información inicial
        miMascota.mostrarInfo();

        // 4) Simular que pasan los años
        miMascota.cumplirAnios(); // edad pasa a 4
        miMascota.mostrarInfo();

        miMascota.cumplirAnios(); // edad pasa a 5
        miMascota.mostrarInfo();
    }
}
