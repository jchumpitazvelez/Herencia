/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesEjercicio2;

/**
 *
 * @author jorge
 */
public class SeleccionFutbol {
    
    int id, edad;
    String nombre, apellidos;

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public SeleccionFutbol() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + ", " + apellidos;
    }    
    
    public int anioNacimiento(int edad){
        int anioNacimiento;
        anioNacimiento = 2022 - edad;
        return anioNacimiento;
    }
    
    public void mayor30(int edad){
        if (edad > 30)
            System.out.println("El Deportista es mayor de 30 años");
        else
            System.out.println("El Deportista su edad es menor o igual a 30 años");
    }
}
