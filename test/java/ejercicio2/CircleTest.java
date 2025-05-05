package ejercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    @Test
    void testDefaultConstructor() {
        Circle circle = new Circle();
        assertEquals(1.0, circle.getRadius(), 0.0001, "El radio por defecto debe ser 1.0");
    }

    @Test
    void testParameterizedConstructor() {
        Circle circle = new Circle(5.0);
        assertEquals(5.0, circle.getRadius(), 0.0001, "El radio debe ser 5.0");
    }

    @Test
    void testSetRadius() {
        Circle circle = new Circle();
        circle.setRadius(3.5);
        assertEquals(3.5, circle.getRadius(), 0.0001, "El radio debe ser 3.5");
    }

    @Test
    void testGetArea() {
        Circle circle = new Circle(2.0);
        assertEquals(Math.PI * 4, circle.getArea(), 0.0001, "El área debe ser π * r^2");
    }

    @Test
    void testGetCircumference() {
        Circle circle = new Circle(2.0);
        assertEquals(2 * Math.PI * 2.0, circle.getCircumference(), 0.0001, "La circunferencia debe ser 2 * π * r");
    }

    @Test
    void testToString() {
        Circle circle = new Circle(2.5);
        assertEquals("Circle {radius=2.5}", circle.toString(), "El toString debe devolver la representación correcta");
    }

}