package ejercicio2;

public class Author {

    // Zona de atributos
    private String name;
    private String email;
    private char gender;

    // Constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Zona de métodos: Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Zona de métodos: Setters
    public void setEmail(String email) {
        this.email = email;
    }

    // Zona de métodos: Otros
    @Override
    public String toString() {
        return "Author {name=" + name + ", email=" + email + ", gender=" + gender + "}";
    }

}