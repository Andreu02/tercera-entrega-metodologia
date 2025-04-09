package ejemplo1;

public class Persona {
    // ZONA DE ATRIBUTOS
    private String nombre = "John Doe";
    private int edad = 18;


    // ZONA DE MÉTODOS
        // Constructor
    public Persona (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

        // Getter's y setter's
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}

