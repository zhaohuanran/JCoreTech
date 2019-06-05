package CH4;

import java.util.Random;

/**
 * This program demonstrates object construction
 *
 * @author Nauh
 * @version 1.20 2019-06-05
 */
public class ConstructorTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee();
        staff[1] = new Employee("Harry", 70000);
        staff[2] = new Employee(40000);
        for (var e : staff
        ) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",id=" + e.getId());
        }
    }
}

class Employee {
    private static int nextId;

    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    private String name = "";
    private int id;
    private double salary;

    {
        id = nextId;
        nextId++;
    }

    public Employee(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee(double s) {
        this("Employee #" + nextId, s);
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}