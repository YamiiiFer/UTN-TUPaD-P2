/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

public class Empleado {
    //Atributos privados (encapsulamiento)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    //Atributo estatico contador global
    
    private static int totalEmpleados = 0;
    
    //Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario){
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        
    }
    //Constructor que recibe solo nombre y puesto
    public Empleado(String nombre, String puesto){
        this.id = totalEmpleados + 1; // id automatico
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000; //salario por defecto
        totalEmpleados++;
    }
    //Metodos sobrecargados actualizarSalario
    public void actualizarSalario(double porcentaje){
        this.salario += this.salario * (porcentaje / 100);
    }
    
    public void actualizarSalario(int cantidadFija){
        this.salario += cantidadFija;
    }
    //Metodo toString
    @Override
    public String toString(){
        return "Empleado [ID: " + id +
                ", Nombre: " + nombre +
                ", Puesto: " +  puesto +
                ", Salario: $" + salario + "]";
    }
    //Metodo estatico
    public static int mostrarTotalEmpleados(){
        return totalEmpleados;
    }
    //Getters y Setters
    public int getId(){
        return id; 
    }
    public String getNombre(){
        return nombre;
    }
    public String getPuesto() {
        return puesto; 
    }
    public double getSalario() {
        return salario; 
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto; 
    }
    public void setSalario(double salario) {
        this.salario = salario; 
    }
}
