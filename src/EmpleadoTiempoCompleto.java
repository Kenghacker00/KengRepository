public class EmpleadoTiempoCompleto extends Empleado{
   private double bono;

   public EmpleadoTiempoCompleto(String nombre, int edad, double salario, double bono) {
    super(nombre, edad, salario);
    this.bono = bono;
   }

   @Override
   public void mostrarInformacion() {
    super.mostrarInformacion();
    double sumTotal = salario + bono;
    System.out.println("Bono: " + bono);
    System.out.println("Salario Total: " + sumTotal);
   }

}
