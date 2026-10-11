package maiormeno;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Instanciar
        Material cien;
        Material prin;
        Material ciena;
        Material sapie;

        //Try-catch
        try{
            cien = new Libro("Cien años de soledad", 1967, 5, "Gabriel García Márquez", true, true);
            prin = new Libro("El Principito", 1943, 3, "Antoine de Saint-Exupéry", false, true);
            ciena = new Audiolibro("Cien años de soledad", 1967, 2, 620);
            sapie = new Audiolibro("Sapiens", 2011, 4, 480);

        } catch(IllegalArgumentException e) {
            System.out.println("Error al crear los materiales: " + e.getMessage());
            System.out.println("No se pudo crear uno o más materiales. Terminando el programa.");
            return;
        }


        //Cien años de soledad como reservado

        ((Reservable) cien).registroReservado();


        //Registrar materiales en el gestor del sistema

        GestorBiblioteca biblioteca = new GestorBiblioteca(); //La variable se llama bilbioteca

        System.out.println("=== REGISTROS ===");

        biblioteca.registroLibros(cien);
        biblioteca.registroLibros(prin);
        biblioteca.registroLibros(ciena);
        biblioteca.registroLibros(sapie);

        System.out.println();

        //Invocar operaciones del gestor y resultados
        //Buscar por titulo "Cien años de soledad"

        System.out.println("=== BÚSQUEDA POR TÍTULO===");

        List<Material> resultadoBusqueda = biblioteca.buscarTitulo("Cien años de soledad");

        for(Material libros : resultadoBusqueda) {
            System.out.println(libros.detallePrestamo());
        }

        System.out.println();

        //Listado de Material (biblioteca)

        System.out.println("=== LISTADO DE MATERIALES===");

        for (Material lectura : biblioteca.todosLibros()) {
            System.out.println(lectura.detallePrestamo());
        }

    }
}