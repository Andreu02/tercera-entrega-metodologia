package ejercicio4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Book2Test {

    @Test
    public void testConstructorYGetters() {
        Book2 book = new Book2("1984", "George Orwell");

        assertEquals("1984", book.getTitle());
        assertEquals("George Orwell", book.getAuthor());
    }

    @Test
    public void testSetters() {
        Book2 book = new Book2("Old Title", "Old Author");

        book.setTitle("New Title");
        book.setAuthor("New Author");

        assertEquals("New Title", book.getTitle());
        assertEquals("New Author", book.getAuthor());
    }

    @Test
    public void testToString() {
        Book2 book = new Book2("Dune", "Frank Herbert");

        assertEquals("Book2 [title=Dune, author=Frank Herbert]", book.toString());
    }
}
