import herramientas.Hexagono;

public class HolaMundo{

    public static void main(String[] args){
        Hexagono hex = new Hexagono(6);
        System.out.println(hex.getPerimetro());
        System.out.println(hex.getApotema());
        System.out.println(hex.getArea());
    }
}