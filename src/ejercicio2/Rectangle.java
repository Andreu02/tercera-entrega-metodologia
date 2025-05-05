package ejercicio2;

public class Rectangle {
    //ZONA DE ATRIBUTOS
    private float length = 1.0f;
    private float width = 1.0f;

    //ZONA DE METODOS
    //constructores
    public Rectangle() {
    }
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    //getters y setters
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }

    //otros
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return 2 * (length + width);
    }
    @Override
    public String toString() {
        return "Rectangle {length=" + length + ", width=" + width + "}";
    }

}