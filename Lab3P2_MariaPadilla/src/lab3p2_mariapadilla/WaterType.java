/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_mariapadilla;

/**
 *
 * @author belen
 */
public class WaterType extends Pokemon {
    int rapidez;
    boolean vida;

   

    public WaterType(int rapidez, boolean vida) {
        this.rapidez = rapidez;
        this.vida = vida;
    }

    public WaterType(int rapidez, boolean vida, String nombre, String numeroEntrada, String naturaleza, boolean atrapado) {
        super(nombre, numeroEntrada, naturaleza, atrapado);
        this.rapidez = rapidez;
        this.vida = vida;
    }

    public int getRapidez() {
        return rapidez;
    }

    public void setRapidez(int rapidez) {
        this.rapidez = rapidez;
    }

    public boolean isVida() {
        return vida;
    }

    public void setVida(boolean vida) {
        this.vida = vida;
    }

   
    public String toString() {
        return "WaterType"+super.toString()+ "{" + "rapidez=" + rapidez + ", vida=" + vida + '}';
    }
    
    
}
