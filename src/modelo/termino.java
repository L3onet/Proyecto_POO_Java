package modelo;

public class termino {
    protected char signo;
    protected int coeficiente;
    protected char variable;
    protected double potencia;

    public termino(char signo, int coeficiente, char variable, double potencia) {
        this.signo = signo;
        this.coeficiente = coeficiente;
        this.variable = variable;
        this.potencia = potencia;
    }

    public char getSigno() {
        return signo;
    }

    public void setSigno(char signo) {
        this.signo = signo;
    }

    public int getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public char getVariable() {
        return variable;
    }

    public void setVariable(char variable) {
        this.variable = variable;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
}
