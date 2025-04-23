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
            case "init":{
                Alumno alumnoVacio = new Alumno("",0,'o');
                guardarObjetoEnArchivo(fichero,alumnoVacio);
                res = true;
            }
            case "show":{
                Alumno alumnoCargado = cargarObjetoDesdeArchivo(fichero, Alumno.class);
                if (alumnoCargado != null) {
                    System.out.println("Alumno cargado: " + alumnoCargado.nombre);
                    res = true;
                }
            }
            default:
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
        String fichero = args[1];
        String operacion = args[0];
        fichero(operacion,fichero);
    }

}
