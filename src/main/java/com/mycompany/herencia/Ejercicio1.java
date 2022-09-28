/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.herencia;

import com.mycompany.herencia.clasesEjercicio1.Profesor;
import java.util.Scanner;

/**
 *
 * @author jorge
 * Tema: Herencia
 * Ejercicio 1
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        String nombreProfesor, apellidosProfesor, cursoProfesor, dniProfesor, fechaNacimiento;
        Profesor profe = new Profesor();
        Scanner sc = new Scanner(System.in);
        
        try{
             System.out.println("Ingrese Nombre del profesor:");
             nombreProfesor = sc.next();//Se captura el valor ingresado por consola.
             System.out.println("Ingrese los Apellidos del Profesor:");
             apellidosProfesor = sc.next();//Se captura el valor ingresado por consola.
             System.out.println("Ingrese Numero de DNI del Profesor:");
             dniProfesor = sc.next();//Se captura el valor ingresado por consola.
             System.out.println("Ingrese Fecha de Nacimiento del Profesor:");
             fechaNacimiento = sc.next();//Se captura el valor ingresado por consola.
             System.out.println("Ingrese Curso del Profesor:");
             cursoProfesor = sc.next();//Se captura el valor ingresado por consola.
             
             profe.setNombre(nombreProfesor);
             profe.setApellidos(apellidosProfesor);
             profe.setDni(dniProfesor);
             profe.setFechaNacimiento(fechaNacimiento);
             profe.setCurso(cursoProfesor);
             
             System.out.println ( profe.toString());
             System.out.println ( profe.pintaProfesor());
             
        }catch(Exception e){
            System.out.println("Datos ingresados de manera no correcta");
        }
    }
}
