package ejercicio5;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();

        // Crear estudiantes
        Estudiante e1 = new Estudiante("Ana", 20);
        Estudiante e2 = new Estudiante("Luis", 22);

        // Crear asignaturas
        Asignatura matematicas = new Asignatura("Matemáticas", Arrays.asList(e1, e2));
        Asignatura historia = new Asignatura("Historia", Arrays.asList(e2));  // Solo Luis

        // Guardar en JSON (puedes guardarlas por separado o juntas en una lista)
        FileWriter writer = new FileWriter("asignaturas.json");
        gson.toJson(Arrays.asList(matematicas, historia), writer);
        writer.close();

        // Leer desde JSON
        FileReader reader = new FileReader("asignaturas.json");
        Asignatura[] asignaturas = gson.fromJson(reader, Asignatura[].class);
        reader.close();

        // Mostrar resultados
        for (Asignatura asig : asignaturas) {
            System.out.println(asig.nombre + ":");
            for (Estudiante est : asig.estudiantes) {
                System.out.println(est.nombre + " - " + est.edad);
            }
            System.out.println(); // línea en blanco entre asignaturas
        }
    }
}

//Al ejecutar aparece el nombre de la asignatura y por debajo aparecerá la lista de los alumnos que pertenecen a cada asignatura
//Sí se puede cambiar los alumnos que hay en cada asignatura en forma de código
