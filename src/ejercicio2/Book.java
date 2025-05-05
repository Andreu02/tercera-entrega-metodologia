package ejercicio2;

public class Book {

    // Zona de atributos
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    // Zona de constructores
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        setPrice(price);
    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        setPrice(price);
        setQty(qty);
    }

    // Zona de métodos: Getters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    // Zona de métodos: Setters
    public void setPrice(double price) {
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public void setQty(int qty) {
        if (qty < 0) {
            this.qty = 0;
        } else {
            this.qty = qty;
        }
    }

    // Zona de métodos: Otros
    public String getAuthorName() {
        return author.getName();
    }

    public String getAuthorEmail() {
        return author.getEmail();
    }

    public char getAuthorGender() {
        return author.getGender();
    }

    @Override
    public String toString() {
        return "Book {name=" + name + ", author=" + author + ", price=" + price + ", qty=" + qty + "}";
    }

}
