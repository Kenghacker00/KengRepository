public class EmpleadoTiempoDeterminado extends Empleado{
    private int mesesTrabajados;

    public EmpleadoTiempoDeterminado(String nombre, int edad, double salario, int mesesTrabajados) {
        super(nombre, edad, salario);
        this.mesesTrabajados = mesesTrabajados;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Meses Trabajados: " + mesesTrabajados);
    }

}
