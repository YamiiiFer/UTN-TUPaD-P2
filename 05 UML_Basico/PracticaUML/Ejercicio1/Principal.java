/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

public class Principal {
     public static void main(String[] args){
        // Crear la foto
        Foto nuevaImagen = new Foto("osito", "jpg");

        // Crear el pasaporte con la foto
        Pasaporte pasaporte = new Pasaporte("A1234567", "2025-10-19", nuevaImagen);

        // Crear el titular
        Titular titular = new Titular("Juan Pérez", "12345678");

        // Asociar pasaporte y titular (bidireccional)
        pasaporte.setTitular(titular);

        // Mostrar información
        pasaporte.mostrarInfo();
        System.out.println();
        titular.mostrarInfo();
        
     }
}
