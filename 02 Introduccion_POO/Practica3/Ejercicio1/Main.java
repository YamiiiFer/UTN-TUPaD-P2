/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;
/**
 * Clase Main con el método main para probar la clase Estudiante.
 *
 * Aquí se crea un objeto usando el constructor vacío y luego se asignan
 * los valores mediante los setters. Finalmente se prueban los métodos
 * subirCalificacion y bajarCalificacion.
 */
public class Main {
    public static void main(String[] args) {
    // 1) Crear el objeto Estudiante usando el constructor vacío
        //    Al crearlo así, los atributos empiezan con valores por defecto:
        //    nombre = null, apellido = null, curso = 0, calificacion = 0.0
        Estudiante alumno = new Estudiante();

     // 2) Cargar los datos del estudiante usando los setters.
        //    Esto respeta el encapsulamiento: no accedemos directamente a los atributos.
        alumno.setNombre("Yamila");
        alumno.setApellido("Fernández");
        alumno.setCurso(2);
        
        // Al usar setCalificacion validamos automáticamente que la calificación quede
        // dentro de 0..10 (gracias a la lógica que está en el setter).
        alumno.setCalificacion(7.5);
    // 3) Mostrar la información inicial por consola
        //    Esperamos: Estudiante: Yamila Fernández | Curso: 2 | Calificación: 7.50
        alumno.mostrarInfo();
    // 4) Subir la calificación en 2 puntos.
        //    El método verifica que el argumento sea positivo y usa el setter,
        //    por lo que no se excederá de 10.
        alumno.subirCalificacion(2);
        //    Esperamos: Calificación 9.50
        alumno.mostrarInfo();
    // 5) Bajar la calificación en 5 puntos.
        //    También valida el argumento y usa el setter (no bajará por debajo de 0).
        alumno.bajarCalificacion(5);
        //    Esperamos: Calificación 4.50
        alumno.mostrarInfo();
    }    
}
