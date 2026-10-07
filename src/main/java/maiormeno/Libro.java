package maiormeno;

import java.util.*;

public class Libro extends Material implements Reservable {
    //Atributos de la subclase libro
    private String autor;
    private boolean estadoConservacion;
    private boolean disponibilidadReserva;

    //Constructor
    public Libro(String titulo, int annoPublicacion, int copiasDisponibles, String autor,
                 boolean estadoConservacion, boolean disponibilidadReserva) {

        super(titulo, annoPublicacion, copiasDisponibles); //super

        this.autor = autor;
        this.estadoConservacion = estadoConservacion;
        this.disponibilidadReserva = disponibilidadReserva;
    }

    //Getter y setters

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) throws IllegalArgumentException{

        if(null != autor && !autor.isEmpty()){
            this.autor = autor;
        } else {
            throw new IllegalArgumentException("Debe ser un autor válido, ni nulo ni vacío.");
        }

    }

    public boolean getEstadoConservacion() {
        return estadoConservacion;
    }

    public void setEstadoConservacion(boolean estadoConservacion){
        this.estadoConservacion = estadoConservacion;

    }

    public boolean getDisponibilidadReserva() {
        return disponibilidadReserva;
    }

    public void setDisponibilidadReserva(boolean disponibilidadReserva) {
        this.disponibilidadReserva = disponibilidadReserva;
    }

    //Comportamiento

    @Override
    public double costoPrestamo() {

        if(estadoConservacion == true){
            return 3500;
        } else {
            return 3500 * 1.20;
        }

    }

    @Override
    public String detallePrestamo() {
        String estado = "Malo";

        if (estadoConservacion == true) {
            estado = "Bueno";
        }

        String detalle = "Tipo: Libro" + "| Título: " + this.getTitulo() + "| Año: " + this.getAnnoPublicacion() +
                "| Copias: " + this.getCopiasDisponibles() + "| Autor: " + this.getAutor() + "| Estado: " + estado +
                "| Disponibilidad: " + this.getDisponibilidadReserva() + "| Costo préstamo: " + costoPrestamo();

        return detalle;
    }

    //Metodos interfaz
    @Override
    public boolean estaReservado() {
        return this.disponibilidadReserva;
    }

    @Override
    public boolean registroReservado() {
        return this.disponibilidadReserva;
    }

}
