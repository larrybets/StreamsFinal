import java.time.LocalDate;

/**
 * Created by DAM on 19/12/16.
 */
public class Jugador {
    private String nombre;
    private int numCanastas;
    private LocalDate nacicmiento;
    private Equipo equipo;


    public Jugador(String nombre, int numCanastas, LocalDate nacicmiento, Equipo equipo) {
        this.nombre = nombre;
        this.numCanastas = numCanastas;
        this.nacicmiento = nacicmiento;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumCanastas() {
        return numCanastas;
    }

    public void setNumCanastas(int numCanastas) {
        this.numCanastas = numCanastas;
    }

    public LocalDate getNacicmiento() {
        return nacicmiento;
    }

    public void setNacicmiento(LocalDate nacicmiento) {
        this.nacicmiento = nacicmiento;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", numCanastas=" + numCanastas +
                ", nacicmiento=" + nacicmiento +
                ", equipo=" + equipo +
                '}';
    }
}
