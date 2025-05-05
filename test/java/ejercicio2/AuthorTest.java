package ejercicio2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class AuthorTest {

    private Author author;

    @BeforeEach
    void setUp() {
        author = new Author("Jane Doe", "jane.doe@example.com", 'f');
    }

    @Test
    void testConstructor() {
        assertEquals("Jane Doe", author.getName());
        assertEquals("jane.doe@example.com", author.getEmail());
        assertEquals('f', author.getGender());
    }

    @Test
    void testGetName() {
        assertEquals("Jane Doe", author.getName());
    }

    @Test
    void testGetEmail() {
        assertEquals("jane.doe@example.com", author.getEmail());
    }

    @Test
    void testGetGender() {
        assertEquals('f', author.getGender());
    }

    @Test
    void testSetEmail() {
        author.setEmail("new.email@example.com");
        assertEquals("new.email@example.com", author.getEmail());
    }

    @Test
    void testToString() {
        assertEquals("Author {name=Jane Doe, email=jane.doe@example.com, gender=f}", author.toString());
    }
}