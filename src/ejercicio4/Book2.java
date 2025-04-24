package ejercicio4;

public class Book2 {
    private String title;
    private String author;

    // Constructor
    public Book2(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // ToString
    @Override
    public String toString() {
        return "Book2 [title=" + title + ", author=" + author + "]";
    }
}
