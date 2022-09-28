/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia.clasesEjercicio1;

/**
 *
 * @author jorge
 * Tema: Herencia
 * Ejercicio 1
 */
public class Profesor extends Persona{
    int     idProfesor;
    String  curso;

    public Profesor(int idProfesor, String curso, String dni, String nombre, String apellidos, String fechaNacimiento, int edad) {
        
        super(dni, nombre, apellidos, fechaNacimiento, edad);//Hereda los atributos de la clase Padre
        this.idProfesor = idProfesor;
        this.curso = curso;
    }

    public Profesor() {
    }

    public Profesor(String dni, String nombre, String apellidos, String fechaNacimiento, int edad) {
        super(dni, nombre, apellidos, fechaNacimiento, edad);
        
        idProfesor = 0;
        curso = "";
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public String toString() {
        return "Nombre Profesor=" + this.getNombre() + ", " + this.getApellidos() + "\nCurso: " +curso;
    }

}
