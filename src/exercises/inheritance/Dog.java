package exercises.inheritance;

public class Dog extends Animal{
    private String breed ="Sexual";
    public Dog(double height, double weight,String breed) {
        super(height, weight);
        this.breed= breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public double runSpeedMetersPerSecond(Dog dog){
        dog.setHeight(getHeight() * 2);
        return dog.getHeight();
    }
}
