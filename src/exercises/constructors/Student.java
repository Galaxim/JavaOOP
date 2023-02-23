package exercises.constructors;

public class Student {
    String name;
    int age;
    public Student(String name,Integer age){
        System.out.println("Constructing!");
        this.name= name;
        this.age= age;
        System.out.println("Constructed!");
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public Student(String name){
        this.name= name;
    }
    public Student(Integer age){
        this.age = age;
    }
    public Student(){
    }
}
