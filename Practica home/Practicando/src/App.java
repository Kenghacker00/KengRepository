public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Auto miAuto = new Auto("Hyundai", "Elantra Sport", 2024);
        Auto miAuto2 = new Auto("Nissan", "GT-R", 2015);

        miAuto.mostrarInformacion();
        miAuto2.mostrarInformacion();
        
    }

    public void obtenerop() {
        System.out.println("1. Comprar Nissan");
        System.out.println("2. Comprar Hyundai");
        System.out.println("3. Salir");

    }
}
