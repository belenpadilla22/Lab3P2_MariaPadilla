/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_mariapadilla;

/**
 *
 * @author belen
 */
public class FireType extends Pokemon{
    
    int potencia;

    public FireType(int potencia) {
        this.potencia = potencia;
    }

    public FireType(int potencia, String nombre, String numeroEntrada, String naturaleza, boolean atrapado) {
        super(nombre, numeroEntrada, naturaleza, atrapado);
        this.potencia = potencia;
    }
    

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "FireType"+ super.toString()+"{" + "potencia=" + potencia + '}';
    }

    
    
    
    
    
}
