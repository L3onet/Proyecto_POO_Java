import Herencia.*;

public class ImplementarHerencia {
    public static void main(String args[]){
        Circulo circulo = new Circulo(23);
        System.out.println(circulo.getPerimetro());
        System.out.println(circulo.getArea());
        Rectangulo rectangulo = new Rectangulo(42,78);
        System.out.println(rectangulo.getPerimetro());
        System.out.println(rectangulo.getArea());
        // Instancia
        Cuadrado cuadrado = new Cuadrado(30);
        System.out.println(cuadrado.getPerimetro());
        System.out.println(cuadrado.getArea());
    }
}
