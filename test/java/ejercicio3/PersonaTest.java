package ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    public void testConstructorYGetters() {
        Persona persona = new Persona("Ana", 25, "Calle Falsa 123");

        assertEquals("Ana", persona.getNombre());
        assertEquals(25, persona.getEdad());
        assertEquals("Calle Falsa 123", persona.getDireccion());
    }

    @Test
    public void testToString() {
        Persona persona = new Persona("Luis", 30, "Av. Siempre Viva 742");
        String esperado = "Persona[nombre=Luis, edad=30, direccion=Av. Siempre Viva 742]";
        assertEquals(esperado, persona.toString());
    }
}
