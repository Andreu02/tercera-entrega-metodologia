package ejercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    void testConstructorWithoutQty() {
        Author author = new Author("George Orwell", "orwell@example.com", 'M');
        Book book = new Book("1984", author, 19.99);

        assertEquals("1984", book.getName());
        assertEquals(author, book.getAuthor());
        assertEquals(19.99, book.getPrice());
        assertEquals(0, book.getQty());
    }

    @Test
    void testConstructorWithQty() {
        Author author = new Author("George Orwell", "orwell@example.com", 'M');
        Book book = new Book("1984", author, 19.99, 10);

        assertEquals("1984", book.getName());
        assertEquals(author, book.getAuthor());
        assertEquals(19.99, book.getPrice());
        assertEquals(10, book.getQty());
    }

    @Test
    void testSetPriceWithNegativeValue() {
        Author author = new Author("Test", "test@example.com", 'F');
        Book book = new Book("Test Book", author, 20.0);
        book.setPrice(-5.0);

        assertEquals(0.0, book.getPrice());
    }

    @Test
    void testSetQtyWithNegativeValue() {
        Author author = new Author("Test", "test@example.com", 'F');
        Book book = new Book("Test Book", author, 10.0);
        book.setQty(-3);

        assertEquals(0, book.getQty());
    }

    @Test
    void testGetAuthorInfoMethods() {
        Author author = new Author("J.K. Rowling", "jk@example.com", 'F');
        Book book = new Book("Harry Potter", author, 29.99);

        assertEquals("J.K. Rowling", book.getAuthorName());
        assertEquals("jk@example.com", book.getAuthorEmail());
        assertEquals('F', book.getAuthorGender());
    }

    @Test
    void testToString() {
        Author author = new Author("Author A", "a@example.com", 'M');
        Book book = new Book("MyBook", author, 12.5, 5);

        String expected = "Book {name=MyBook, author=" + author.toString() + ", price=12.5, qty=5}";
        assertEquals(expected, book.toString());
    }
}
