package herramientas;

import herramientas.Estadisticas;

public class Implementacion {

    public void Ejercicio(){
        int[] valores;
        valores = new int[5];
        valores[0] = 2;
        valores[1] = 4;
        valores[2] = 8;
        valores[3] = 7;
        valores[4] = 9;
        Estadisticas prueba = new Estadisticas(valores);
        prueba.getDesviacion();
    }
}
