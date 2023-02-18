package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course {
    String courseName = "Java";
    int maxStudents = 25;
    int qualityRatingOutOf10 = 10;
    boolean areStudentsAdult = true;
    int durationCourseInMonths = 6;
    List<Student> students = new ArrayList<>();
    List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
    List<Integer> studentAges = Arrays.asList(23, 31, 38);
}
