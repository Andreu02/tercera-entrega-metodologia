package ejercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Point3DTest {

    @Test
    public void testPoint3DDefaultConstructor() {
        Point3D point = new Point3D();
        assertEquals(0.0f, point.getX(), 0.001);
        assertEquals(0.0f, point.getY(), 0.001);
        assertEquals(0.0f, point.getZ(), 0.001);
    }

    @Test
    public void testPoint3DConstructorWithValues() {
        Point3D point = new Point3D(3.5f, 4.5f, 5.5f);
        assertEquals(3.5f, point.getX(), 0.001);
        assertEquals(4.5f, point.getY(), 0.001);
        assertEquals(5.5f, point.getZ(), 0.001);
    }

    @Test
    public void testSetZ() {
        Point3D point = new Point3D();
        point.setZ(6.5f);
        assertEquals(6.5f, point.getZ(), 0.001);
    }

    @Test
    public void testSetXYZ() {
        Point3D point = new Point3D();
        point.setXYZ(1.5f, 2.5f, 3.5f);
        assertArrayEquals(new float[]{1.5f, 2.5f, 3.5f}, point.getXYZ(), 0.001f);
    }

    @Test
    public void testGetXYZ() {
        Point3D point = new Point3D(1.5f, 2.5f, 3.5f);
        assertArrayEquals(new float[]{1.5f, 2.5f, 3.5f}, point.getXYZ(), 0.001f);
    }

    @Test
    public void testToString() {
        Point3D point = new Point3D(1.5f, 2.5f, 3.5f);
        assertEquals("Point3D {x=1.5, y=2.5, z=3.5}", point.toString());
    }
}