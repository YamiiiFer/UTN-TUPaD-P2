/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_3;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; //Asociación Bidireccional

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
       //Si paso el mismo profesor ya asignado no hago nada
        if(profesor == this.profesor){
        return;
    }
        //Si el profesor seteado es distinto a null
        //primero nos borramos de su lista
       if(this.profesor != null){
          this.profesor.eliminarCurso(this);
       }
       //Asignamos al nuevo profesor
       this.profesor = profesor;
       
       //Si el nuevo profesor es distinto de null y no agrego a este curso
       //Lo agregamos
       if(profesor!=null && !profesor.getCursos().contains(this)){
           profesor.agregarCurso(this);
       }
    }
    public void mostrarInfo(){
        System.out.println("El codigo del curso es: "+codigo+
                "\nel nombre del curso es: "+nombre+
                "\nel profesor asignado al curso es: "+profesor.getNombre());    
    }  
}
