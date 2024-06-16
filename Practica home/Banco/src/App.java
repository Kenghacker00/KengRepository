public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        CuentaBancaria cuenta = new CuentaBancaria("Howard", 7);

        cuenta.depositar(30);
        cuenta.retirar(0);
        cuenta.mostrarInformacion();
    }
}
