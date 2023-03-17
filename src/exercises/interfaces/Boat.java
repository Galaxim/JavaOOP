package exercises.interfaces;

public class Boat implements Movable{
    @Override
    public boolean moveForward() {
        return true;
    }

    @Override
    public boolean moveBackward() {
        return false;
    }
}
