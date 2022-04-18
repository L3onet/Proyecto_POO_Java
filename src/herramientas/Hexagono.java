package herramientas;

public class Hexagono {

    private double cateto;
    private double perimetro;
    private double apotema;
    private double area;

    public Hexagono(double cateto){
        this.cateto = cateto;
        this.calcularPerimetro();
        this.calcularApotema();
        this.calcularArea();
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getApotema() {
        return apotema;
    }

    public double getArea() {
        return area;
    }

    public void calcularPerimetro(){
        this.perimetro = this.cateto * 6;}

    public void calcularApotema(){
        this.apotema = (Math.sqrt((this.cateto * this.cateto) - ((this.cateto / 2) * (this.cateto / 2))));}

    public void calcularArea(){
        this.area = (this.perimetro * this.apotema)/2;}

}
