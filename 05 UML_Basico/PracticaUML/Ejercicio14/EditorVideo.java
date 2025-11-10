/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio14;
public class EditorVideo {

     // Dependencia de creación:
    // Crea un Render dentro del método, pero no lo conserva como atributo
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        System.out.println("Exportando proyecto: " + render.getProyecto().getNombre() + " en formato " + render.getFormato());
    }
}
