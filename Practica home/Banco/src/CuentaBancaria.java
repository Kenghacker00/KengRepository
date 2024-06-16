public class CuentaBancaria {
    private String titular;
    private int saldo;

    public CuentaBancaria(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;

    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Deposito Realizado. Saldo actual: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva");
            
        }

    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro Realizado. Saldo actual: " + saldo);
        } else {
            System.out.println("Fondos insuficientes o cantidad invalida");
            
        }

    }

    public void mostrarInformacion() {
        System.out.println("Titular: " + titular + ", Saldo: " + saldo);


    }

}
