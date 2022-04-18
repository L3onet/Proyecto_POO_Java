package metodosStatic;

import java.math.*;

public class MetodoStatic {

    // Método de instancia
    public void Mensaje(String mensaje){
        System.out.println(mensaje);
    }

    // Método de clase
    public static void HolaMundo(String mensaje){
        System.out.println(mensaje);
    }

    public static void main(String args[]){
        // Llamar a un metodo de clase
        MetodoStatic.HolaMundo("Saludos desde un metodo de clase");
        System.out.println(Math.sqrt(4));

        // Crear una instancia
        MetodoStatic mensaje = new MetodoStatic();

        // Llamar a un metodo de instancia
        mensaje.Mensaje("Saludos desde un metodo de instancia");
    }
}
