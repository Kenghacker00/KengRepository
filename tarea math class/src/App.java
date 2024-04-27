// Nombre: Howard Fernando Gonzalez Fonseca
// Carnet: 2024-1379U

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, num3;

        // Repetimos el bloque de código hasta que el usuario ingrese tres números diferentes
        do {
            // Solicitamos al usuario que ingrese tres números
            System.out.println("Ingrese tres numeros enteros diferentes");
            num1 = leer.nextInt();
            num2 = leer.nextInt();
            num3 = leer.nextInt();

            leer.close(); // Cerrar scanner

            // Si los números no son diferentes, mostramos un mensaje de error y repetimos la solicitud
            if (num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("Los números deben ser diferentes. Intente de nuevo.");
            }
        } while (num1 == num2 || num1 == num3 || num2 == num3);

        // Utilizamos la clase Math para encontrar el número más grande
        int mayor = Math.max(num1, Math.max(num2, num3));
        // Utilizamos la clase Math para encontrar el número más pequeño
        int menor = Math.min(num1, Math.min(num2, num3));

        // Determinamos el número intermedio que no es ni el mayor ni el menor
        int intermedio = (num1 != mayor && num1 != menor) ? num1 : (num2 != mayor && num2 != menor) ? num2 : num3;

        // Calculamos la suma de los dos números más pequeños
        int sumaPequenos = menor + intermedio;
        // Calculamos la diferencia entre los dos números más grandes
        int diferenciaGrandes = mayor - intermedio;

        // Mostramos los resultados de las operaciones que le pedimos al usuario
        System.out.println("La suma de los dos números más pequeños es: " + sumaPequenos);
        System.out.println("La diferencia entre los dos números más grandes es: " + diferenciaGrandes);
        System.out.println("El número más grande es: " + mayor);

    }
}
