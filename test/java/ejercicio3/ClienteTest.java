package ejercicio3;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void testConstructorYGetters() {
        Coche coche1 = new Coche("BMW", "X5", 2020);
        Coche coche2 = new Coche("Audi", "A3", 2018);
        List<Coche> coches = Arrays.asList(coche1, coche2);
        CuentaBancaria cuenta = new CuentaBancaria("Laura", 12000.00, "Corriente");

        Cliente cliente = new Cliente("Laura", coches, cuenta);

        assertEquals("Laura", cliente.getNombre());
        assertEquals(coches, cliente.getCoches());
        assertEquals(cuenta, cliente.getCuentaBancaria());
    }

    @Test
    public void testToString() {
        Coche coche = new Coche("Toyota", "Yaris", 2019);
        CuentaBancaria cuenta = new CuentaBancaria("Carlos", 5000.0, "Ahorro");
        Cliente cliente = new Cliente("Carlos", List.of(coche), cuenta);

        String esperado = "Cliente[nombre=Carlos, coches=" + List.of(coche).toString() +
                ", cuentaBancaria=" + cuenta.toString() + "]";
        assertEquals(esperado, cliente.toString());
    }
}
