/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesEjercicio2;

/**
 *
 * @author jorge
 */
public class Entrenador extends SeleccionFutbol{
    int idFederacion;
    
    public Entrenador(){
        super();//Se heredan todos los atributos de la clase padre.
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
    
}
