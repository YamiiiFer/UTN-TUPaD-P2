/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;
/**
 * Clase Estudiante
 *
 * Esta clase representa el modelo de un estudiante con atributos privados
 * y métodos públicos para manipular su estado respetando el principio
 * de encapsulamiento.
 *
 * - Atributos: nombre, apellido, curso, calificacion
 * - Constructor: vacío (se usa el constructor por defecto)
 * - Métodos: getters/setters, mostrarInfo(), subirCalificacion(), bajarCalificacion()
 */
public class Estudiante {
    
    //Atributos (encapsulados)
// -----------------------------
    // Atributos (visibilidad privada)
    // -----------------------------
    // Se declaran private para evitar acceso directo desde fuera de la clase.
    // Esto permite validar o controlar cambios mediante setters.
    
    private String nombre;
    private String apellido;
    private int curso;
    private double calificacion; // entre 0 y 10 (ejemplo de restricción)
/**
     * Constructor vacío explícito.
     * Java provee un constructor por defecto si no lo escribís, pero lo ponemos
     * explícito para que quede claro que la intención es crear objetos y luego
     * establecer sus valores con setters.
     */
    public Estudiante() {}
        // No inicializamos nada aquí: los atributos quedan con sus valores
        // por defecto (null para Strings, 0 para int/double).    

    // --------------------------------
    // Getters y Setters (encapsulamiento)
    // --------------------------------

    /**
     * Devuelve el nombre del estudiante.
     */
    public String getNombre() {
        return nombre;
    }
     /**
     * Establece el nombre del estudiante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre; // 'this' diferencia el atributo del parámetro
    }
    /**
     * Devuelve el apellido del estudiante.
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * Establece el apellido del estudiante.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    /**
     * Devuelve el curso del estudiante.
     */
    public int getCurso() {
        return curso;
    }
    /**
     * Establece el curso del estudiante.
     * No hacemos validaciones adicionales; si el curso no puede ser negativo,
     * podríamos añadir:
     *   if (curso < 0) curso = 0;
     */
    public void setCurso(int curso) {
        this.curso = curso;
    }
    /**
     * Devuelve la calificación actual del estudiante.
     */
    public double getCalificacion() {
        return calificacion;
    }
    /**
     * Establece la calificación del estudiante.
     *
     * Aquí aplicamos una validación sencilla para mantener la calificación
     * dentro de un rango lógico (0 .. 10). Esa validación evita que métodos
     * externos pongan valores inválidos directamente.
     */
    public void setCalificacion(double calificacion) {
        // Si la calificación pasada es menor a 0, la normalizamos a 0.
        if (calificacion < 0) {
            calificacion = 0;
        }
        // Si la calificación pasada es mayor a 10, la normalizamos a 10.
        if (calificacion > 10) {
            calificacion = 10;
        }
        // Finalmente asignamos al atributo.
        this.calificacion = calificacion;
    }
    // -----------------------------
    // Métodos de comportamiento
    // -----------------------------

    /**
     * Muestra por consola la información del estudiante en un formato legible.
     * Usamos printf para formatear la calificación con dos decimales.
     */
    public void mostrarInfo() {
        System.out.printf("Estudiante: %s %s | Curso: %d | Calificación: %.2f%n",
                          nombre, apellido, curso, calificacion);
    }
    /**
     * Sube la calificación en la cantidad de puntos indicada.
     *
     * - Si puntos es negativo, no permitimos la operación (evitamos confusión).
     * - Llamamos a setCalificacion(...) para aprovechar la validación del setter
     *   (por ejemplo, para que no supere 10).
     */
    public void subirCalificacion(double puntos) {
        if (puntos <= 0) {
            // Mensaje informativo: el método espera un número positivo.
            System.out.println("subirCalificacion: los puntos deben ser mayores que 0.");
            return;
        }
        // sumamos y delegamos la validación al setter (clamping 0..10)
        setCalificacion(this.calificacion + puntos);
    }
        /**
     * Baja la calificación en la cantidad de puntos indicada.
     *
     * - Si puntos es negativo, indicamos al usuario el uso correcto.
     * - Llamamos a setCalificacion(...) para evitar que la calificación quede por debajo de 0.
     */
    public void bajarCalificacion(double puntos) {
        if (puntos <= 0) {
            System.out.println("bajarCalificacion: los puntos deben ser mayores que 0.");
            return;
        }
        // restamos y delegamos la validación al setter (clamping 0..10)
        setCalificacion(this.calificacion - puntos);
    }

}
