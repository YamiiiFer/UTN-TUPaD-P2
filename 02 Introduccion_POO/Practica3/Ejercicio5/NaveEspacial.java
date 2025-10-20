/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

public class NaveEspacial {
    //rtriutos de la Nave
    private String nombre;
    private int combustible; //cantidad actual de combustible
    private final int MAX_COMBUSTIBLE = 100; // Límite máximo de combustible permitido
    // 🔹 Constructor: se usa para crear una nave con un nombre y cierta cantidad inicial de combustible
    public NaveEspacial(String nombre, int combustible){
        this.nombre = nombre;
        this.combustible = combustible;// Se asigna lo que recibe al atributo 
    }
    
    //Metodo para despegar
    public void despegar(){
        if(combustible >= 10){// Validamos que haya al menos 10 de combustible
            combustible -= 10;// Se gastan 10 unidades al despegar
            System.out.println(nombre + " ha despegado 🚀");
        }else{
            System.out.println("No hay suficiente combustible para despegar");
        }
    }
    //Metodo para avanzar cierta distancia
    public void avanzar(int distancia){
        int consumo = distancia * 2;// Por ejemplo, cada unidad de distancia gasta 2 de combustible
        if (combustible >= consumo){
            combustible -= consumo; //Restammos el combustible consumido
            System.out.println(nombre + " avanzó " + distancia + "km");
        }else{
            System.out.println("Combustible insuficiente para avanzar.");
        }
    }
    //Metodo para recargar combustible
    public void recargarCombustible(int cantidad){
        if (combustible + cantidad <= MAX_COMBUSTIBLE){
            combustible += cantidad; //Sumamos la cantidad
            System.out.println("Se recargaron " + cantidad + " unidades de combustible. ");
        }else{
            combustible = MAX_COMBUSTIBLE;//Si se pasa lo dejamos en el maximo permitido
            System.out.println("Tanque lleno, no se puede superar " +   MAX_COMBUSTIBLE + " ⛽");
            
        }
    }
    //Mostrar el estado actual de la Nave
    public void mostrarEstado(){
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible restante: " + combustible + "/" + MAX_COMBUSTIBLE);
    }
}
