package ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CocheTest {

    @Test
    public void testConstructorYGetters() {
        Coche coche = new Coche("Ford", "Mustang", 2021);

        assertEquals("Ford", coche.getMarca());
        assertEquals("Mustang", coche.getModelo());
        assertEquals(2021, coche.getAnio());
    }

    @Test
    public void testToString() {
        Coche coche = new Coche("Toyota", "Corolla", 2015);
        String esperado = "Coche[marca=Toyota, modelo=Corolla, anio=2015]";
        assertEquals(esperado, coche.toString());
    }
}
