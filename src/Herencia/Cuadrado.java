package Herencia;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double lado) {
        if (lado < 0) {
            this.lado = 0;
        } else {
            this.lado = lado;
        }
        this.calcularArea();
        this.calcularPerimetro();
    }

    @Override
    public void calcularArea() {
        this.area = this.lado * this.lado;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = this.lado * 4;
    }

}
