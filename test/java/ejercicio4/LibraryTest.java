package ejercicio4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testConstructorYGetters() {
        Book2[] books = {
                new Book2("The Hobbit", "J.R.R. Tolkien"),
                new Book2("Dune", "Frank Herbert")
        };

        Library library = new Library("Sci-Fi Library", books);

        assertEquals("Sci-Fi Library", library.getName());
        assertArrayEquals(books, library.getBooks());
    }

    @Test
    public void testSetters() {
        Book2[] books1 = {
                new Book2("Book A", "Author A")
        };

        Book2[] books2 = {
                new Book2("Book B", "Author B"),
                new Book2("Book C", "Author C")
        };

        Library library = new Library("Old Library", books1);
        library.setName("New Library");
        library.setBooks(books2);

        assertEquals("New Library", library.getName());
        assertArrayEquals(books2, library.getBooks());
    }

    @Test
    public void testToString() {
        Book2[] books = {
                new Book2("Clean Code", "Robert C. Martin")
        };

        Library library = new Library("Dev Library", books);

        assertEquals("Library [name=Dev Library, books=1 books]", library.toString());
    }
}
