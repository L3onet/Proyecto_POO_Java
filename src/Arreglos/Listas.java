package Arreglos;

import java.util.ArrayList;

public class Listas {
    ArrayList<Alumno> alumnos = new ArrayList<>();

    public void agregarDatos(){
        Alumno Alejandro = new Alumno(21930010, "Alejandro",
                "Vidal", "Perez", 18,
                "Ing. Informática");
        alumnos.add(Alejandro);
        alumnos.add(new Alumno(21930122L, "Isabel",
                "Granados", "Rebollar",
                18, "Ing. Informática"));
        alumnos.add(new Alumno(21930103L, "Natalia",
                "Gutierrez", "Pineda", 18,
                "Ing. Informática"));
    }

    public void mostrarDatos(){
        System.out.println("Núm. de control \t Nombre \t Apellido paterno \t " +
                "Apellido materno \t Edad \t Programa educativo");
        // Recorrido a una lista usando FOR
        for (int i = 0; i < alumnos.size(); i++){
            System.out.println(String.format("%.0f",alumnos.get(i).getNumControl()) +
                    " \t\t\t " + alumnos.get(i).getNombre() +
                    " \t " + alumnos.get(i).getApellidoP() +
                    " \t\t\t " + alumnos.get(i).getApellidoM() +
                    " \t\t\t " + alumnos.get(i).getEdad() +
                    " \t " + alumnos.get(i).getProgramaEducativo());
        }

        // Recorrido a una lista usando el método foreach de la clase ArrayList
        alumnos.forEach((n) -> System.out.println(String.format("%.0f",n.getNumControl()) +
                " \t\t\t " + n.getNombre() +
                " \t " + n.getApellidoP() +
                " \t\t\t " + n.getApellidoM() +
                " \t\t\t " + n.getEdad() +
                " \t " + n.getProgramaEducativo()));
    }

    public static void main(String args[]){
        Listas ejemplo = new Listas();
        ejemplo.agregarDatos();
        ejemplo.mostrarDatos();
    }

}
