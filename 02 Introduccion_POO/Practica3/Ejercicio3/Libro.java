/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

public class Libro {
  // 🔒 Atributos privados (encapsulamiento)
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // 📌 Constructor para inicializar el objeto
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion); // Usamos el setter para validar
//GETTERS: Permiten acceder al atributos de forma controlada
    }
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    public int getanioPublicacion(){
        return anioPublicacion;
    }
   // ⚠️ Setter con validación para el año
    public void setAnioPublicacion(int anioPublicacion){
        if(anioPublicacion > 0 && anioPublicacion <= 2025){
            this.anioPublicacion = anioPublicacion;
        }else{
             System.out.println("⚠️ Año inválido. Se asigna 0 por defecto.");
            this.anioPublicacion = 0;
        }
    }

    // 📖 Método para mostrar la información del libro
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);    
    }
}
