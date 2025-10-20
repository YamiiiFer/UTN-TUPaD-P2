/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

public class Gallina {
     // 🐔 Atributos
    private int idGallina;
    private int edad;          // en meses o años, según quieras
    private int huevosPuestos;
    
     // 🐣 Constructor
    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0; // arranca sin huevos puestos
    }
     // 🍳 Método para poner un huevo
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina " + idGallina + " puso un huevo 🥚. Total: " + huevosPuestos);
    }
    // ⏳ Método para envejecer
    public void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " cumplió un año más. Edad: " + edad);
    }
    // 📊 Mostrar el estado actual
    public void mostrarEstado() {
        System.out.println("🐔 Gallina " + idGallina + " → Edad: " + edad + " años | Huevos puestos: " + huevosPuestos);
    }
    
}
