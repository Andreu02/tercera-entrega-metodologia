package ejercicio3;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private String tipo;

    // Constructor
    public CuentaBancaria(String titular, double saldo, String tipo) {
        this.titular = titular;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    // Getters
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }

    // toString
    @Override
    public String toString() {
        return "CuentaBancaria[titular=" + titular + ", saldo=" + saldo + ", tipo=" + tipo + "]";
    }
}
