package ejercicio3;

public class Coche {
    private String marca;
    private String modelo;
    private int anio;

    // Constructor
    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    // toString
    @Override
    public String toString() {
        return "Coche[marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + "]";
    }
}
