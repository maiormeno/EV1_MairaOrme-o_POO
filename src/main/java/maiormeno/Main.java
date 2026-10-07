package maiormeno;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Instanciar
        Material cien = new Libro("Cien años de soledad", 1967, 5, "Gabriel García Márquez", "Bueno", true);
        Material prin = new Libro("El Principito", 1943, 3, "Antoine de Saint-Exupéry", "Deteriorado", true);
        Material ciena = new Audiolibro("Cien años de soledad", 1967, 2, 620);
        Material sapia = new Audiolibro("Sapiens", 2011, 4, 480);


        System.out.println("Libro 1: " + cien);
        System.out.println("Libro 2: " + prin);
        System.out.println("Libro 3: " + ciena);
        System.out.println("Libro 4: " + sapia);

        //Cien años de soledad como reservado



        //Registrar materiales en el gestor e instanciar



        //Invocar operaciones del gestor y resultados






    }
}