import java.util.*;
import java.util.stream.*;

class Student {
    int id;
    String name;
    double marks;

    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + marks;
    }
}

public class StudentStream {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student(1, "Asha", 85.5),
            new Student(2, "Rohan", 60.0),
            new Student(3, "Meera", 92.3),
            new Student(4, "Vikram", 70.5),
            new Student(5, "Nisha", 88.8)
        );

        System.out.println("Students with marks > 70, sorted by marks:");
        students.stream()
                .filter(s -> s.marks > 70)
                .sorted(Comparator.comparingDouble(s -> s.marks))
                .forEach(System.out::println);

        System.out.println("\nStudents sorted by name:");
        students.stream()
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(System.out::println);
    }
}
