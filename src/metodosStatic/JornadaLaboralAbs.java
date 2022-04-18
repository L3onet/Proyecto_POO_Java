package metodosStatic;

public abstract class JornadaLaboralAbs {

    public static double calcularSalario(int horasTrabajadas, double salario ) {
        double salarioTotal = horasTrabajadas * salario;
        return salarioTotal;
    }
    public static double calcularSalarioHrsExtra(int horasTrabajadas, double salario, int horasExtras ) {
        double salarioTotal = horasTrabajadas * salario;
        double totalHorasExtras = horasExtras *(salario*1.5);
        salarioTotal += totalHorasExtras;
        return salarioTotal;
    }
}
