/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;
public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Yamila Fernandez", "39306875");
        Banco banco = new Banco("Banco Nación", "30-99999999-9");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9876-5432", "12/28", banco);
        cliente.setTarjeta(tarjeta);
        System.out.println("Cliente: " + tarjeta.getCliente().getNombre());
        System.out.println("Banco: " + tarjeta.getBanco().getNombre());
    }
}
