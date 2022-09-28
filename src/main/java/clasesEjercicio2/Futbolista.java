/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesEjercicio2;

/**
 *
 * @author jorge
 */
public class Futbolista extends SeleccionFutbol{
    int dorsal;
    String posicion;

    public Futbolista() {
        super();
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    public int mayorEdad(int edad){
        int mayoredad=0;
        if (edad >= 18) 
             mayoredad=1;
        
        return mayoredad;
    }
}
