package ejercicio4;

public class Library {
    // ZONA DE ATRIBUTOS
    private String name;
    private Book2[] books;  // Un array de objetos Book2

    // ZONA DE MÉTODOS
        // Constructor
    public Library(String name, Book2[] books) {
        this.name = name;
        this.books = books;
    }

        // Getters
    public String getName() {
        return name;
    }

    public Book2[] getBooks() {
        return books;
    }

        // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(Book2[] books) {
        this.books = books;
    }

        // ToString
    @Override
    public String toString() {
        return "Library [name=" + name + ", books=" + books.length + " books]";
    }
}

