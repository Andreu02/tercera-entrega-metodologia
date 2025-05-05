package ejercicio4;

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
                Book2[] books = new Book2[] {
                        new Book2("1984", "George Orwell"),
                        new Book2("To Kill a Mockingbird", "Harper Lee"),
                        new Book2("Brave New World", "Aldous Huxley")
                };

                Library library = new Library("City Library", books);

                guardarObjetoEnArchivo(fichero, library);
                System.out.println("Archivo con biblioteca creado.");
                res = true;

            }

            case "show": {
                Library library = cargarObjetoDesdeArchivo(fichero, Library.class);
                if (library != null) {
                    System.out.println("Nombre de la biblioteca: " + library.getName());
                    System.out.println("Libros:");
                    for (Book2 book : library.getBooks()) {
                        System.out.println(" - Título: " + book.getTitle());
                        System.out.println("   Autor: " + book.getAuthor());
                    }
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


//Cada elemento del array se convierte en un objeto JSON y el propio array se convierte en un arreglo de JSON
//Si los objetos del array tienen propiedades, las propiedades se incluyen en el elemento del JSON correspondiente