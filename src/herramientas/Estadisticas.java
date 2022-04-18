package herramientas;

public class Estadisticas {

    private int[] valores;
    private int sumatoria;
    private float media;
    private double varianza;
    private double desviacion;

    /*
        División de los programas en memoria
        CS - Segmento de código
        DS - Segmento de datos
        SS - Segmento de pila
        ES - Segmento extra

        Espacio que ocupa el programa en la memoria

     */

    public Estadisticas(int[] valores) {
        this.valores = valores;
    }

    public int[] getValores() {
        return valores;
    }

    public void setValores(int[] valores) {
        this.valores = valores;
    }

    public int getSumatoria() {
        return sumatoria;
    }

    public void setSumatoria(int sumatoria) {
        this.sumatoria = sumatoria;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public double getVarianza() {
        return varianza;
    }

    public void setVarianza(double varianza) {
        this.varianza = varianza;
    }

    public double getDesviacion() {
        return desviacion;
    }

    public void setDesviacion(double desviacion) {
        this.desviacion = desviacion;
    }

    public void calcularDatosEstadisticos() {
        for (int i = 0; i < valores.length; i++ ){
            sumatoria = sumatoria + valores[i];
        }
        media = sumatoria / valores.length;

        for(int i = 0 ; i < valores.length; i++){
            double rango;
            rango = Math.pow(valores[i]-media,2f);
            varianza = varianza + rango;
        }
        varianza = varianza / valores.length;
        desviacion = Math.sqrt(varianza);
    }
}