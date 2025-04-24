package ejercicio4;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        // Crear libros (objetos Book2)
        Book2[] books = new Book2[] {
                new Book2("1984", "George Orwell"),
                new Book2("To Kill a Mockingbird", "Harper Lee"),
                new Book2("Brave New World", "Aldous Huxley")
        };

        // Crear una biblioteca (Library) con el array de libros
        Library library = new Library("City Library", books);

        // Convertir el objeto Library a JSON usando Gson
        Gson gson = new Gson();
        String json = gson.toJson(library);

        // Mostrar el JSON generado
        System.out.println(json);

        // Convertir el JSON de vuelta a un objeto para demostrar deserialización
        Library deserializedLibrary = gson.fromJson(json, Library.class);
        System.out.println("\nDeserialized Library:");
        System.out.println(deserializedLibrary);
    }
}

//Cada elemento del array se convierte en un objeto JSON y el propio array se convierte en un arreglo de JSON
//Si los objetos del array tienen propiedades, las propiedades se incluyen en el elemento del JSON correspondiente