package ejercicio2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void testDefaultConstructor() {
        Rectangle rectangle = new Rectangle();
        assertEquals(1.0f, rectangle.getLength(), 0.0001, "La longitud por defecto debe ser 1.0");
        assertEquals(1.0f, rectangle.getWidth(), 0.0001, "El ancho por defecto debe ser 1.0");
    }

    @Test
    void testParameterizedConstructor() {
        Rectangle rectangle = new Rectangle(5.0f, 3.0f);
        assertEquals(5.0f, rectangle.getLength(), 0.0001, "La longitud debe ser 5.0");
        assertEquals(3.0f, rectangle.getWidth(), 0.0001, "El ancho debe ser 3.0");
    }

    @Test
    void testSetLength() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4.5f);
        assertEquals(4.5f, rectangle.getLength(), 0.0001, "La longitud debe ser 4.5");
    }

    @Test
    void testSetWidth() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(2.5f);
        assertEquals(2.5f, rectangle.getWidth(), 0.0001, "El ancho debe ser 2.5");
    }

    @Test
    void testGetArea() {
        Rectangle rectangle = new Rectangle(4.0f, 2.0f);
        assertEquals(8.0, rectangle.getArea(), 0.0001, "El área debe ser longitud * ancho");
    }

    @Test
    void testGetPerimeter() {
        Rectangle rectangle = new Rectangle(4.0f, 2.0f);
        assertEquals(12.0, rectangle.getPerimeter(), 0.0001, "El perímetro debe ser 2 * (longitud + ancho)");
    }

    @Test
    void testToString() {
        Rectangle rectangle = new Rectangle(2.5f, 1.5f);
        assertEquals("Rectangle {length=2.5, width=1.5}", rectangle.toString(), "El toString debe devolver la representación correcta");
    }
}