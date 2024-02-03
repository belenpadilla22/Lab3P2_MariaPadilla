/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_mariapadilla;

/**
 *
 * @author belen
 */
public class GrassType extends Pokemon{
    String habitad;
    int dominio;

    public GrassType() {
    }
    

    public GrassType(String habitad, int dominio) {
        this.habitad = habitad;
        this.dominio = dominio;
    }

    public GrassType(String habitad, int dominio, String nombre, String numeroEntrada, String naturaleza, boolean atrapado) {
        super(nombre, numeroEntrada, naturaleza, atrapado);
        this.habitad = habitad;
        this.dominio = dominio;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public int getDominio() {
        return dominio;
    }

    public void setDominio(int dominio) {
        this.dominio = dominio;
    }

    
    public String supertoString() {
        return "GrassType" +super.toString()+"{" + "habitad=" + habitad + ", dominio=" + dominio + '}';
    }
    
    
}
