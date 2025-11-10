/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;
public class Main {
    
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Yamila Fernandez", "39456789");
        Bateria bateria = new Bateria("BTX-5000", 4000);
        Celular celular = new Celular("Samsung", "A52", "123456789012345", bateria);
        usuario.setCelular(celular);
        System.out.println("Usuario: " + celular.getUsuario().getNombre());
        System.out.println("Celular: " + celular.getMarca());
        System.out.println("Batería: " + celular.getBateria().getModelo());
        System.out.println("Celular: " + celular.getMarca()+ " Batería: " + bateria.getCapacidad());
    }
    
}
