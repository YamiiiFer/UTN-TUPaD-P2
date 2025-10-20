/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author el10d
 */
public class Principal {
      public static void main(String[] args) {

        // Crear la batería
        Bateria bateria1 = new Bateria("Samsung-BA01", "4500mAh");

        // Crear el celular con la batería
        Celular celular1 = new Celular("9876543210", "Samsung", "Galaxy S22", bateria1);

        // Crear el usuario
        Usuario usuario1 = new Usuario("Yamila Fernández", "12345678");

        // Asociar celular y usuario (bidireccional)
        celular1.setUsuario(usuario1);

        // Mostrar información completa
        celular1.mostrarInfo();
    }
}
