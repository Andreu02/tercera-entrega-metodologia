package ejercicio5;

import java.util.List;

public class Asignatura {
    //ZONA DE ATRIBUTOS
    String nombre;
    List<Estudiante> estudiantes;

    //ZONA DE MÉTODOS
        //constructor
    public Asignatura(String nombre, List<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }
}
