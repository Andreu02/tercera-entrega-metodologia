package ejemplo1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @Test
    void testConstructorYGetters() {
        Persona persona = new Persona("Ana", 25);
        assertEquals("Ana", persona.getNombre());
        assertEquals(25, persona.getEdad());
    }

    @Test
    void testSetters() {
        Persona persona = new Persona("Inicial", 0);

        persona.setNombre("Luis");
        persona.setEdad(40);

        assertEquals("Luis", persona.getNombre());
        assertEquals(40, persona.getEdad());
    }
}
