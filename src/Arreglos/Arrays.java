package Arreglos;

public class Arrays {
    /*
    private int numero1;
    private int numero2;
    private int numero3;
    */

    private int[] numero = new int[3];
    private int[][] excel = new int[3][2];

    public void operacionesArreglos(){
        numero[0] = 23;
        numero[1] = 35;
        numero[2] = 67;
        // numero[3] = 45; Error del tipo ArrayIndexOutOfBoundsException
        // System.out.println(numero.length);
        excel[0][0] = 34;
        excel[0][1] = 78;
        excel[1][0] = 67;
        excel[1][1] = 56;
        excel[2][0] = 53;
        excel[2][1] = 45;
    }

    public void recorridoArreglos(){
        for (int i = 0; i < numero.length; i++){
            System.out.println("Elemento " + i + ": " + numero[i]);
        }
    }

    public void recorridoArregloMultidimensional(){
        /*
        for (int i = 0; i < excel.length; i++){
            System.out.println("Elemento " + i + ": " + excel[i]);
        }
        */
        for (int i=0;i<excel.length;i++){
            for(int j=0;j<excel[0].length;j++){
                System.out.println("Elemento [" + i + "]["+j +"]: "+ excel[i][j]);
            }
        }
        //System.out.println(excel.length);
        //System.out.println(excel[0].length);
    }

    public static void main(String args[]){
        Arrays miarreglo = new Arrays();
        miarreglo.operacionesArreglos();
        miarreglo.recorridoArregloMultidimensional();

    }

}
