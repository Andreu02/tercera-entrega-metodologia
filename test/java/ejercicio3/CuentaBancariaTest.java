package ejercicio3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CuentaBancariaTest {

    @Test
    public void testConstructorYGetters() {
        CuentaBancaria cuenta = new CuentaBancaria("Laura Gómez", 2500.75, "Corriente");

        assertEquals("Laura Gómez", cuenta.getTitular());
        assertEquals(2500.75, cuenta.getSaldo());
        assertEquals("Corriente", cuenta.getTipo());
    }

    @Test
    public void testToString() {
        CuentaBancaria cuenta = new CuentaBancaria("Pedro López", 5000.00, "Ahorro");
        String esperado = "CuentaBancaria[titular=Pedro López, saldo=5000.0, tipo=Ahorro]";
        assertEquals(esperado, cuenta.toString());
    }
}
