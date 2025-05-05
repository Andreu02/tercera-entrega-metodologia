package ejercicio1;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static boolean fichero(String operacion, String fichero){
        boolean res = false;
        Gson gson = new Gson();
        switch (operacion){
            case "init": {
                Alumno alumnoVacio = new Alumno("", 0, 'o');
                guardarObjetoEnArchivo(fichero, alumnoVacio);
                System.out.println("Archivo creado con un alumno vacío.");
                res = true;

            }
            case "show": {
                Alumno alumnoCargado = cargarObjetoDesdeArchivo(fichero, Alumno.class);
                if (alumnoCargado != null) {
                    System.out.println("Alumno cargado: ");
                    System.out.println("Nombre: " + alumnoCargado.nombre);
                    System.out.println("Edad: " + alumnoCargado.edad);
                    System.out.println("Sexo: " + alumnoCargado.gender);
                    res = true;
                }

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

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            sb.append("Argumento " + i + ": " + args[i] + "\n");
        }
        System.out.println("Argumentos: \n" + sb);


        if (args.length == 2) {
            fichero(args[0], args[1]);
        } else {
            System.out.println("Uso correcto: java -jar TuProyecto.jar <init/show> <fichero>");
        }
    }
}
