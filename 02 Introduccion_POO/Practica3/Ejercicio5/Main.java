/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

public class Main {
    public static void main(String[] args){
    //Crear una nave con 50 unidades de combustible
    NaveEspacial nave1 = new NaveEspacial("Apollo", 50);
    
    //Intentar avanzar sin recargar (probablemente falle por poco combustible)
    nave1.avanzar(30);//30km = 60 de combustible (no alcanza con 50)
    
    //Recargar combustible
    nave1.recargarCombustible(40);
    
    //Intentar despegar y avanzar correctamente
    nave1.despegar();
    nave1.avanzar(20);
    
    //Mostrar estado final
    nave1.mostrarEstado();
    
    }
}
