package HerenciaMetodoConstructor;

public class Empleado {
    protected String nombreEmpleado;
    protected double salario;
    protected double total;
    protected String numeroSemana;
    protected double salarioTotal;

    public Empleado(String nombreEmpleado, double salario, String numeroSemana){
        this.nombreEmpleado = nombreEmpleado;
        this.salario = salario;
        this.numeroSemana = numeroSemana;
    }

    public void calcularSalario(){

    }

    public double getSalarioTotal(){
        return this.salarioTotal;
    }
}
