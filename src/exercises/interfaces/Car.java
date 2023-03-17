package exercises.interfaces;

public class Car implements Movable{
    @Override
    public boolean moveForward() {
        return true;
    }

    @Override
    public boolean moveBackward() {
        return true;
    }
}
