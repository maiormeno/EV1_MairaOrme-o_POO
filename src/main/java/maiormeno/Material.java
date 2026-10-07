package maiormeno;

public abstract class Material {
    //Atributos
    protected String titulo;
    protected int annoPublicacion;
    protected int copiasDisponibles;

    //Constructor
    public Material(String titulo, int annoPublicacion, int copiasDisponibles) {
        this.titulo = titulo;
        this.annoPublicacion = annoPublicacion;
        this.copiasDisponibles = copiasDisponibles;
    }

    //Getter y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws IllegalArgumentException {

       if(titulo != null && titulo.length() != 0) {
           this.titulo = titulo;
       } else {
           throw new IllegalArgumentException("Titulo no puede ser nulo ni vacío.");
       }

    }

    public int getAnnoPublicacion() {
        return annoPublicacion;
    }

    public void setAnnoPublicacion(int annoPublicacion) throws IllegalArgumentException {

        if(1450 <= annoPublicacion && annoPublicacion <= 2026){
            this.annoPublicacion = annoPublicacion;
        } else {
            throw new IllegalArgumentException("El año de publicación debe encontrarse entre 1450 - 2026.");
        }

    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(int copiasDisponibles) {
        if (copiasDisponibles > 0) {
            this.copiasDisponibles = copiasDisponibles;
        } else {
            throw new IllegalArgumentException("Las copias deben ser mayor que cero.");
        }
    }

//Costo prestamo
    public abstract double costoPrestamo();

    public abstract String detallePrestamo();

    @Override
    public String toString() {
        return "|| Titulo: " + this.titulo + "|| Año de publicacion: " + this.annoPublicacion;
    }

}
