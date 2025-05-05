package ejercicio2;

public class Circle {
    // ZONA DE ATRIBUTOS
    private double radius = 1.0d;

    //ZONA DE METODOS
    //constructores
    public Circle() {
    }
    public Circle(double ratio) {
        this.radius = ratio;
    }

    //getters y setters
    public double getRadius(){
        return radius;
    }
    public void setRadius(double ratio){
        this.radius = ratio;
    }

    //otros
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle {radius=" + radius + "}";
    }

}