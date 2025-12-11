package GeometricObjects;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String colour, boolean filled){
        this.radius = radius;
        setColour(colour);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }


}
