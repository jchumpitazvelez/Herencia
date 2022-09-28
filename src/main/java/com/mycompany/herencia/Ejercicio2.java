/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.herencia;

import clasesEjercicio2.*;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombreFutbolista, nombreEntrenador, nombreMasajista;
        int edadDeportista;
        String apellidoFutbolista, apellidoEntrenador, apellidoMasajista;
        Futbolista futbolista = new Futbolista();
        Entrenador entrenador = new Entrenador();
        Masajista  masajista  = new Masajista();
        Scanner sc = new Scanner(System.in);
        
        try{
             System.out.println("Ingrese Nombre del Entrenador:");
             nombreEntrenador = sc.nextLine();
             
             System.out.println("Ingrese Apellido del Entrenador:");
             apellidoEntrenador = sc.nextLine();
             
             System.out.println("Ingrese la Edad del Entrenador:");
             edadDeportista = sc.nextInt();
             entrenador.setEdad(edadDeportista);
             
             System.out.println("Ingrese Nombre del Futbolista:");
             nombreFutbolista = sc.next();
             
             System.out.println("Ingrese Apellido del Futbolista:");
             apellidoFutbolista = sc.next();
             
             System.out.println("Ingrese la Edad del Futbolista:");
             edadDeportista = sc.nextInt();
             
             futbolista.setEdad(edadDeportista);
           
             System.out.println("Ingrese Nombre del Masajista:");
             nombreMasajista = sc.next();
             
             System.out.println("Ingrese Apellido del Masajista:");
             apellidoMasajista = sc.next();
             
             
             System.out.println("Ingrese la Edad del Masajista:");
             edadDeportista = sc.nextInt();
             masajista.setEdad(edadDeportista);
          
             entrenador.setNombre(nombreEntrenador);
             entrenador.setApellidos(apellidoEntrenador);
             
            futbolista.setNombre(nombreFutbolista);
             futbolista.setApellidos(apellidoFutbolista);
             
             masajista.setNombre(nombreMasajista);
             masajista.setApellidos(apellidoMasajista);
             
             System.out.println("\n==========Pintando Resultados========");
             System.out.println("Nombres y Apellidos del Entrenador : "+entrenador.toString());
             System.out.println("Año de Nacimiento: "+ entrenador.anioNacimiento(entrenador.getEdad()));
             entrenador.mayor30(entrenador.getEdad());
             System.out.println("Nombres y Apellidos del Futbolista : "+futbolista.toString());
             System.out.println("Año de Nacimiento: "+ futbolista.anioNacimiento(futbolista.getEdad()));
             if(futbolista.mayorEdad(futbolista.getEdad())==1)
                 System.out.println("Futbolista es Mayor de Edad ");
             else
                 System.out.println("Futbolista es Menor de Edad ");
             futbolista.mayor30(futbolista.getEdad());
             System.out.println("Nombres y Apellidos del Masajista : "+masajista.toString());
             System.out.println("Año de Nacimiento: "+ masajista.anioNacimiento(masajista.getEdad()));
             masajista.mayor30(masajista.getEdad());
             
        }catch(Exception e){
            System.out.println("Datos ingresados de manera no correcta");
        }
    }
    
}

/*1.- Ingresar la Edad de cada uno de los Integrantes de la Seleccion y calcular el año de nacimiento
  2.- Crear un método que permita identificar si el Futbolista es mayor de edad o no
  3.- Crear un método que indique si el Integrante de la selección es mayor de 30 años*/
