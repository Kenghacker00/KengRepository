public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Biblioteca mBibliotecan = new Biblioteca();
        mBibliotecan.agregarLibro(new Libro("CORALINE", "JURGEN KLOPP", 2011));
        mBibliotecan.agregarLibro(new Libro("MySQL", "Ingenieros", 2013));

        mBibliotecan.mostrarLibros();
    }
}
