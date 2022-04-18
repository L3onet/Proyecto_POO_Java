// importar de otras clases
import herramientas.Estadisticas;

// importar de librerias predefinidas
import java.math.*;

public class Errores {
    public static int numerador = 10;
    public static int denominador = 0;
    public static double division;

    public static void main(String args[]){
        System.out.println("Antes de la division");
        try {
            division = numerador / denominador;
        } catch (ArithmeticException ex) {
            System.out.println("No se puede dividir entre cero");
        } finally {
            System.out.println("Division: " + division);
            System.out.println("Despues de la division");
        }
    }
}
