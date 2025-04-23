package json;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestMain {
    // Borramos el método para guardar un objeto en un archivo JSON

    // Método para cargar un objeto desde un archivo JSON
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
// Ruta del archivo donde se guardará el objeto
        String rutaArchivo = "usuario.json";
// Cargar el objeto Usuario desde el archivo JSON
        Usuario usuarioCargado = cargarObjetoDesdeArchivo(rutaArchivo, Usuario.class);
        if (usuarioCargado != null) {
            System.out.println("Usuario cargado: " + usuarioCargado.nombre);
        }
    }
    // Clase Usuario para los ejemplos
    static class Usuario {
        String nombre;
        int edad;
        String correo;
        public Usuario(String nombre, int edad, String correo) {
            this.nombre = nombre;
            this.edad = edad;
            this.correo = correo;
        }
// Getters y setters no incluidos por brevedad
    }
}
