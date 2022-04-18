public class JornadaLaboral {
    private String nombreEmpleado;
    private String numeroSemana;
    private int horasTrabajadas;
    private int horasExtras;
    private double salario;
    private double total;
    private double totalHorasExtras;
    private double salarioTotal;

        /*
        Esta clase calcula el salario que debe recibir un empleado después de una jornada laboral
        */

    public double getSalarioTotal () {return salarioTotal;}

    public JornadaLaboral(int horasTrabajadas, double salario) {
        this.horasTrabajadas = horasTrabajadas;
        this.salario = salario;
        this.calcularSalarioNormal();
    }

    public JornadaLaboral(int horasTrabajadas, int horasExtras, double salario) {
        this.horasTrabajadas = horasTrabajadas;
        this.horasExtras = horasExtras;
        this.salario = salario;
        this.calcularSalarioNormal();
        this.calcularCostoHorasExtras();
    }

    public void calcularSalarioNormal() {
        this.salarioTotal = this.horasTrabajadas * this.salario;
    }

    public void calcularCostoHorasExtras() {
        this.totalHorasExtras = this.horasExtras *(this.salario*1.5);
        this.salarioTotal += this.totalHorasExtras;
    }
}
