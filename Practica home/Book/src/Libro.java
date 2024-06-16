public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
    }

    public void infoLibros() {
        System.out.println("Titulo: " + titulo + " Autor: " + autor + " Año de publicacion: " + añoPublicacion);
    }

}
