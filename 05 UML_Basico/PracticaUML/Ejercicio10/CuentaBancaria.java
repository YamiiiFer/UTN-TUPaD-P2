/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio10;
public class CuentaBancaria {

    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;// Composición (CuentaBancaria → ClaveSeguridad)
    private Titular titular;// Asociación bidireccional (CuentaBancaria ↔ Titular)

    public CuentaBancaria(String cbu, double saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, ultimaModificacion);
    }
    public String getCbu() {
        return cbu;
    }
    public double getSaldo() {
        return saldo;
    }
    public ClaveSeguridad getClave() {
        return clave;
    }
    public Titular getTitular() {
        return titular;
    }
    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this) {
            titular.setCuenta(this);
        }
    }
}
