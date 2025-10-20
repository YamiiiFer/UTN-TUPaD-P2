/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;

public class Main {

    public static void main(String[] args) {
        // Crear empleados con ambos constructores
        Empleado emp1 = new Empleado(1, "Juan Pérez", "Analista", 70000);
        Empleado emp2 = new Empleado("María López", "Desarrolladora");
        Empleado emp3 = new Empleado("Carlos Gómez", "Tester");
        
        // Aplicar aumentos de salario
        emp1.actualizarSalario(10); // aumento del 10%
        emp2.actualizarSalario(5000); // aumento fijo de 5000
        
        // Imprimir información
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        
        // Mostrar total de empleados creados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
