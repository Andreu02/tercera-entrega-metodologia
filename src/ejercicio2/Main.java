package ejercicio2;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static boolean fichero(String operacion, String fichero) {
        boolean res = false;
        Gson gson = new Gson();

        switch (operacion) {
            case "init": {
                // Crear objetos Circle
                Circle circle1 = new Circle(5.0);
                Circle circle2 = new Circle(3.0);

                // Crear objetos Rectangle
                Rectangle rectangle1 = new Rectangle(4.0f, 6.0f);
                Rectangle rectangle2 = new Rectangle(10.0f, 3.0f);

                // Crear objetos Author
                Author author1 = new Author("J.K. Rowling", "jkrowling@example.com", 'F');
                Author author2 = new Author("George Orwell", "georgeorwell@example.com", 'M');

                // Crear objetos Book
                Book book1 = new Book("Harry Potter", author1, 39.99, 100);
                Book book2 = new Book("1984", author2, 19.99, 150);

                // Guardar los objetos en el archivo
                guardarObjetoEnArchivo(fichero, new Object[]{circle1, circle2, rectangle1, rectangle2, author1, author2, book1, book2});
                System.out.println("Archivo creado con los objetos.");
                res = true;
                break;
            }

            case "show": {
                // Cargar los objetos desde el archivo
                Object[] objetosCargados = cargarObjetoDesdeArchivo(fichero, Object[].class);
                if (objetosCargados != null) {
                    for (Object obj : objetosCargados) {
                        System.out.println(obj);
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
        // Mostrar los argumentos recibidos
        if (args.length == 2) {
            fichero(args[0], args[1]);
        } else {
            System.out.println("Uso correcto: java -jar TuProyecto.jar <init/show> <fichero>");
        }
    }
}
