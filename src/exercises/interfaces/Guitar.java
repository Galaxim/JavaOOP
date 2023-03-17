package exercises.interfaces;

public class Guitar extends Instrument{
    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public String play() {
        return "Fantastic guitar sounds";
    }
}
