import metodosStatic.MetodoStatic;

public class ProbarMetodoStatic {
    public static void main(String args[]){
        MetodoStatic.HolaMundo("Saludos desde un metodo static");
        MetodoStatic mensaje = new MetodoStatic();

        mensaje.Mensaje("Saludos desde un metodo no static");
    }
}
