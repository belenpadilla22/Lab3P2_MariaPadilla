/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_mariapadilla;

/**
 *
 * @author belen
 */
public class Pokeball {
    String color, serie;
    int eficiencia;

    public Pokeball(String color, String serie, int eficiencia) {
        this.color = color;
        this.serie = serie;
        this.eficiencia = eficiencia;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(int eficiencia) {
        this.eficiencia = eficiencia;
    }

    @Override
    public String toString() {
        return "Pokeball{" + "color=" + color + ", serie=" + serie + ", eficiencia=" + eficiencia + '}';
    }
    
    
}
