package Arreglos;

// Clase POJO (Plain Old Java Object)
public class Alumno {
    private double numControl;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private int edad;
    private String programaEducativo;

    public Alumno(double numControl, String nombre, String apellidoP, String apellidoM, int edad, String programaEducativo) {
        this.numControl = numControl;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.edad = edad;
        this.programaEducativo = programaEducativo;
    }

    public double getNumControl() {
        return numControl;
    }

    public void setNumControl(double numControl) {
        this.numControl = numControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProgramaEducativo() {
        return programaEducativo;
    }

    public void setProgramaEducativo(String programaEducativo) {
        this.programaEducativo = programaEducativo;
    }

    public Alumno(double numControl, String nombre, String apellidoP, String apellidoM, int edad) {
        this.numControl = numControl;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.edad = edad;
    }
}
