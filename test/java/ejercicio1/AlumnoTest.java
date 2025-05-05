package ejercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {

    @Test
    void testConstructorYGetters() {
        Alumno alumno = new Alumno("María", 22, 'F');

        assertEquals("María", alumno.getNombre());
        assertEquals(22, alumno.getEdad());
        assertEquals("María - 22 años - Sexo: F", alumno.toString());
    }

    @Test
    void testSetters() {
        Alumno alumno = new Alumno("Inicial", 0, 'M');

        alumno.setNombre("Carlos");
        alumno.setEdad(30);

        assertEquals("Carlos", alumno.getNombre());
        assertEquals(30, alumno.getEdad());
        // El campo `gender` no tiene setter, así que no se prueba cambio
    }
}
