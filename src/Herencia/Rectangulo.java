package Herencia;

public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        if (base < 0 || altura < 0){
            this.altura = 0;
            this.base = 0;
        } else {
            this.base = base;
            this.altura = altura;
        }
        this.calcularArea();
        this.calcularPerimetro();
    }

    @Override
    public void calcularArea() {
        this.area = this.altura * this.base;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = (this.altura * 2) + (this.base * 2);
    }

}
