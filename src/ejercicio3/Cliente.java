package ejercicio3;

import java.util.List;

public class Cliente {
    private String nombre;
    private List<Coche> coches;
    private CuentaBancaria cuentaBancaria;

    // Constructor
    public Cliente(String nombre, List<Coche> coches, CuentaBancaria cuentaBancaria) {
        this.nombre = nombre;
        this.coches = coches;
        this.cuentaBancaria = cuentaBancaria;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public List<Coche> getCoches() {
        return coches;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    // toString
    @Override
    public String toString() {
        return "Cliente[nombre=" + nombre + ", coches=" + coches + ", cuentaBancaria=" + cuentaBancaria + "]";
    }
}
