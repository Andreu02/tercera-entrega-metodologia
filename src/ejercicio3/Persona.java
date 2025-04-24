package ejercicio3;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    // Constructor
    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    // toString
    @Override
    public String toString() {
        return "Persona[nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + "]";
    }
}
