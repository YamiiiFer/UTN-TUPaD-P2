/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;
public class Libro {

    private String titulo;
    private String isbn;
    private Autor autor; // Asociación unidireccional → el Libro conoce al Autor
    private Editorial editorial;   // Agregación → el Libro está asociado a una Editorial

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getIsbn() {
        return isbn;
    }
    public Autor getAutor() {
        return autor;
    }
    public Editorial getEditorial() {
        return editorial;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
}
