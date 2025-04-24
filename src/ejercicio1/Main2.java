package ejercicio1;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
    public static boolean fichero(String operacion, String fichero){
        boolean res = false;
        Gson gson = new Gson();
        switch (operacion){
            case "init": {
                Alumno a1 = new Alumno("Mario", 21, 'M');
                Alumno a2 = new Alumno("Lucía", 20, 'F');
                Alumno a3 = new Alumno("Carlos", 22, 'M');

                Alumno[] alumnos = {a1, a2, a3}; // Un array de alumnos

                guardarObjetoEnArchivo(fichero, alumnos); // Guardas el array

                System.out.println("Archivo creado con varios alumnos.");
                res = true;
                break;
            }

            case "show": {
                Alumno[] alumnos = cargarObjetoDesdeArchivo(fichero, Alumno[].class); // Cambia de Alumno.class a Alumno[].class

                if (alumnos != null) {
                    for (Alumno a : alumnos) {
                        System.out.println("Nombre: " + a.nombre);
                        System.out.println("Edad: " + a.edad);
                        System.out.println("Sexo: " + a.gender);
                        System.out.println("--------------------");
                    }
                    res = true;
                }
                break;
            }
            default:
                System.out.println("Operación no válida. Usa 'init' o 'show'.");
        }
        return res;
    }

    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // Mostrar argumentos recibidos
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            sb.append("Argumento " + i + ": " + args[i] + "\n");
        }
        System.out.println("Argumentos: \n" + sb);

        // Ejecutar lógica si se pasaron correctamente los parámetros
        if (args.length == 2) {
            fichero(args[0], args[1]);
        } else {
            System.out.println("Uso correcto: java -jar TuProyecto.jar <init/show> <fichero>");
        }
    }
}
