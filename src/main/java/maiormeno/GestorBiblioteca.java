package maiormeno;

import java.util.*;

public class GestorBiblioteca {
    //Creacion lista
    private List<Material>libros;

    //Constructor
    public GestorBiblioteca() {
        this.libros = new ArrayList<Material>();
    }

    //Getter y Setters
    public List<Material> getLibros() {
        return libros;
    }

    public void setLibros(List<Material> libros) {
        this.libros = libros;
    }

    //Metodos

    //Registro del libro
    public void registroLibros(Material lectura) {
        this.libros.add(lectura);

        System.out.println(lectura.getTitulo() + " Se ha registrado correctamente.");
    }

    //Todos los libros
    public List<Material> todosLibros() {
        return libros;
    }

    //Buscar por título
    public List<Material> buscarTitulo(String titulo) {

        List<Material> busqueda = new ArrayList<Material>();

        for (Material materialBiblioteca : this.libros) {

            if(materialBiblioteca.getTitulo().equals(titulo)) {
                busqueda.add(materialBiblioteca);
            }
        } return busqueda;
    }
}
