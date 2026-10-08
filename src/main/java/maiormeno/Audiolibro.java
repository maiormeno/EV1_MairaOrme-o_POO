package maiormeno;

import java.util.*;

public class Audiolibro extends Material {
    //Atributos de la subclase Audiolibro
    private int duracionMinutos; //Se utiliza int para dar con minutos exactos.

    //Constructor
    public Audiolibro(String titulo, int annoPublicacion, int copiasDisponibles, int duracionMinutos) {
        //super
        super(titulo, annoPublicacion, copiasDisponibles);

        this.duracionMinutos = duracionMinutos;
    }

    //Getter y setters
    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    //Comportamientos
    @Override
    public double costoPrestamo() {

        if( duracionMinutos <= 300) {
            return 2800;
        } else {
            return 2800 * 1.15;
        }
    }

    @Override
    public String detallePrestamo() {

        String detalle = "Tipo: Audiolibro" + " | Título: " + this.getTitulo() + " | Año: " + this.getAnnoPublicacion() +
                " | Copias: " + this.copiasDisponibles + " | Duración: " + this.duracionMinutos +
                " | Costo préstamo: " + costoPrestamo();

        return detalle;
    }

}
