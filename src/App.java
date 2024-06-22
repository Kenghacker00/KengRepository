import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new  EmpleadoTiempoCompleto("Howard", 17, 2000, 200));
        empleados.add(new EmpleadoTiempoDeterminado("Larios", 27, 40000, 6));

        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
            System.out.println();
        }
    }
}
