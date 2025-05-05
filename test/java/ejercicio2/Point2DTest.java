package ejercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Point2DTest {

    @Test
    public void testPoint2DDefaultConstructor() {
        Point2D point = new Point2D();
        assertEquals(0.0f, point.getX(), 0.001);
        assertEquals(0.0f, point.getY(), 0.001);
    }

    @Test
    public void testPoint2DConstructorWithValues() {
        Point2D point = new Point2D(3.5f, 4.5f);
        assertEquals(3.5f, point.getX(), 0.001);
        assertEquals(4.5f, point.getY(), 0.001);
    }

    @Test
    public void testSetX() {
        Point2D point = new Point2D();
        point.setX(2.5f);
        assertEquals(2.5f, point.getX(), 0.001);
    }

    @Test
    public void testSetY() {
        Point2D point = new Point2D();
        point.setY(3.5f);
        assertEquals(3.5f, point.getY(), 0.001);
    }

    @Test
    public void testSetXY() {
        Point2D point = new Point2D();
        point.setXY(1.5f, 2.5f);
        assertArrayEquals(new float[]{1.5f, 2.5f}, point.getXY(), 0.001f);
    }

    @Test
    public void testToString() {
        Point2D point = new Point2D(1.5f, 2.5f);
        assertEquals("Point2D {x=1.5, y=2.5}", point.toString());
    }
}