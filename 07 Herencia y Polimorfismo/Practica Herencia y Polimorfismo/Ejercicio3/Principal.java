/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;
// ----- Principal -----
public class Principal {
    public static void main(String[] args) {
        Empleado[] empleados = {
            new EmpleadoPlanta("Ana", 200000),
            new EmpleadoTemporal("Luis", 80, 1500)
        };

        for (Empleado e : empleados) {
            System.out.println("Empleado: " + e.nombre);
            System.out.println("Sueldo: " + e.calcularSueldo());

            // instanceof + downcasting
            if (e instanceof EmpleadoPlanta) {
                System.out.println("Es empleado de planta.");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.println("Es empleado temporal.");
            }

            System.out.println();
        }
    }
}

