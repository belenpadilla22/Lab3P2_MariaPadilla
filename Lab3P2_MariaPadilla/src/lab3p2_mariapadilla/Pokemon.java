
package lab3p2_mariapadilla;

// clase padre 
public class Pokemon {
    String nombre, numeroEntrada,naturaleza;
    boolean atrapado;

    public Pokemon() {
    }

    public Pokemon(String nombre, String numeroEntrada, String naturaleza, boolean atrapado) {
        this.nombre = nombre;
        this.numeroEntrada = numeroEntrada;
        this.naturaleza = naturaleza;
        this.atrapado = atrapado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroEntrada() {
        return numeroEntrada;
    }

    public void setNumeroEntrada(String numeroEntrada) {
        this.numeroEntrada = numeroEntrada;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public boolean isAtrapado() {
        return atrapado;
    }

    public void setAtrapado(boolean atrapado) {
        this.atrapado = atrapado;
    }

    @Override
    public String toString() {
        return  "Pokemon{" + "nombre=" + nombre + ", numeroEntrada=" + numeroEntrada + ", naturaleza=" + naturaleza + ", atrapado=" + atrapado + '}';
    }
    

 
    
}
