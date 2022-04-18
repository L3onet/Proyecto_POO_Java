package Herencia;
import java.math.*;

public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio){
        if (radio < 0){
            this.radio = 0;
        } else {
            this.radio = radio;
        }
        this.calcularArea();
        this.calcularPerimetro();
    }

    @Override
    public void calcularArea() {
        this.area = Math.PI * (Math.pow(this.radio, 2));
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = (2 * Math.PI) * this.radio;
    }

}
