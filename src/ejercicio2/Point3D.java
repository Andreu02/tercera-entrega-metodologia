package ejercicio2;

public class Point3D extends Point2D{
    // ZONA DE ATRIBUTOS
    float z;


    // ZONA DE METODOS
    // Constructor
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public Point3D(){
        new Point2D().getXY();
        z = 0.0f;
    }

    // Getter's y setter's
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public float[] getXY(){
        return new float[]{getX(),getY()};
    }

    public float[] getXYZ(){
        return new float[]{getX(),getY(),z};
    }

    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        this.z = z;
    }

    // Otros
    @Override
    public String toString() {
        return "Point3D {x=" + getX() + ", y=" + getY() + ", z=" + z + "}";
    }

}