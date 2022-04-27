package HerenciaMetodoConstructor;

public class EmpleadoHorasExtras extends Empleado {
    private int horasExtra;
    private double totalHorasExtra;

    public EmpleadoHorasExtras(String nombreEmpleado, double salario, String numeroSemana, int horasExtra) {
        super(nombreEmpleado, salario, numeroSemana);
        this.horasExtra = horasExtra;
    }
}
