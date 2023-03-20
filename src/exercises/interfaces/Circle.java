package exercises.interfaces;

public class Circle extends Shape{

    public Circle(double radius) {
        super(radius * 2,radius * 2);
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow((getHeight() / 2), 2);
    }
}
