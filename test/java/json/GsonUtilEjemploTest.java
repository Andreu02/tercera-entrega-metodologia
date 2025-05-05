package json;

import org.junit.jupiter.api.*;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class GsonUtilEjemploTest {

    private static final String TEMP_FILE = "test_usuario.json";

    @AfterEach
    void cleanUp() {
        File file = new File(TEMP_FILE);
        if (file.exists()) file.delete();
    }

    @Test
    void testGuardarYCargarObjetoDesdeArchivo() {
        GsonUtilEjemplo.Usuario original = new GsonUtilEjemplo.Usuario("Juan", 30, "juan@example.com");
        GsonUtilEjemplo.guardarObjetoEnArchivo(TEMP_FILE, original);

        assertTrue(new File(TEMP_FILE).exists(), "El archivo debe haberse creado");

        GsonUtilEjemplo.Usuario cargado = GsonUtilEjemplo.cargarObjetoDesdeArchivo(TEMP_FILE, GsonUtilEjemplo.Usuario.class);
        assertNotNull(cargado);
        assertEquals("Juan", cargado.nombre);
        assertEquals(30, cargado.edad);
        assertEquals("juan@example.com", cargado.correo);
    }

    @Test
    void testCargarArchivoInexistenteLanzaExcepcionYDevuelveNull() {
        GsonUtilEjemplo.Usuario usuario = GsonUtilEjemplo.cargarObjetoDesdeArchivo("archivo_inexistente.json", GsonUtilEjemplo.Usuario.class);
        assertNull(usuario);
    }

    @Test
    void testCargarDesdeDirectorioFuerzaIOExceptionYDevuelveNull() throws IOException {
        File directorio = new File("directorio_fake");
        directorio.mkdir();

        try {
            GsonUtilEjemplo.Usuario usuario = GsonUtilEjemplo.cargarObjetoDesdeArchivo("directorio_fake", GsonUtilEjemplo.Usuario.class);
            assertNull(usuario);
        } finally {
            directorio.delete(); // limpieza
        }
    }
}
