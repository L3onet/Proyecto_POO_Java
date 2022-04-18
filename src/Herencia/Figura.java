package Herencia;

public abstract class Figura {
    protected double area;
    protected double perimetro;

    public abstract void calcularArea();

    public abstract void calcularPerimetro();

    public double getArea(){
        return this.area;
    }

    public double getPerimetro(){
        return this.perimetro;
    }
}
