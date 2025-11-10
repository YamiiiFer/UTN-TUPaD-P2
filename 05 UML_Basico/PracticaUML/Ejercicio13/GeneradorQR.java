/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio13;
public class GeneradorQR {
    // Dependencia de creación: el método crea un objeto CodigoQR dentro de él
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("QR generado para: " + qr.getUsuario().getNombre() + " - Valor: " + qr.getValor());
    }
}
