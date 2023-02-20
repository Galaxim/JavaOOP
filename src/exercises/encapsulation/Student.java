package exercises.encapsulation;

public class Student {

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;
    private int age;
    private double height;
    private double weight;
    private String lastName;


    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        System.out.println("Getz has an height of "+ age + "" + " meters");
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age<0){
            System.out.println("YOU not exist");
        }
        this.age = age;

    }

    public void setHeight(double height) {
        height++;
        this.height = height;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        if (name.contains("X") == true){
            System.out.println("You must have an exotic name");
        }
        this.name = name;
    }

    public void setWeight(double weight) {
        if (weight > 500){
            System.out.println("You should go to a doctor");
        }
        this.weight = weight;
    }
}
