/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        // 📚 Crear un libro válido
        
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);
        
        // Mostrar información inicial

        System.out.println("📖 Información inicial:");
        libro1.mostrarInfo();

        // Intentar modificar el año con un valor inválido
        System.out.println("\n🔄 Intentando asignar año inválido (3000):");
        libro1.setAnioPublicacion(3000);  // debería asignar 0 y mostrar advertencia
        
        // Mostrar información después del intento inválido
        libro1.mostrarInfo();
        
        // Modificar el año con un valor válido
        System.out.println("\n✅ Asignando año válido (1995):");
        libro1.setAnioPublicacion(1995);

        // Mostrar información final
        System.out.println("\n📖 Información final:");
        libro1.mostrarInfo();
        }
} 
