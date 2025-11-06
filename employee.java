import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id + " - " + name + " - " + salary;
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Alice", 75000));
        employees.add(new Employee(102, "Bob", 55000));
        employees.add(new Employee(103, "Charlie", 90000));
        employees.add(new Employee(104, "David", 60000));

        System.out.println("Before Sorting:");
        employees.forEach(System.out::println);

        // Sort by salary using lambda
        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));

        System.out.println("\nAfter Sorting by Salary:");
        employees.forEach(System.out::println);

        // Sort by name using lambda
        employees.sort((e1, e2) -> e1.name.compareTo(e2.name));

        System.out.println("\nAfter Sorting by Name:");
        employees.forEach(System.out::println);
    }
}
