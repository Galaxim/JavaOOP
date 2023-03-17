package exercises.interfaces;

public class Rectangle extends Shape{

    public Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow((getHeight() / 2), 2);
    }
}
