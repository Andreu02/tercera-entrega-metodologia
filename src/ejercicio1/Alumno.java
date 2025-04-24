package ejercicio1;

public class Alumno {
    // ZONA DE ATRIBUTOS
    String nombre;
    int edad;
    char gender;

    // ZONA DE MÉTODOS
        // Constructor
    public Alumno (String nombre, int edad, char g){
        this.nombre =  nombre;
        this.edad = edad;
        this.gender = g;
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

        // Otros
        @Override
        public String toString() {
            return nombre + " - " + edad + " años - Sexo: " + gender;
        }
}
