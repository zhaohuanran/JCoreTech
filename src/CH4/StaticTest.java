package CH4;

/**
 * This program demonstrates static methods.
 *
 * @author Nauh
 * @version 1.01 2019-05-31
 */
public class StaticTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee objects.
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Cat", 40000.0);
        staff[1] = new Employee("Dog", 51000.0);
        staff[2] = new Employee("Meo", 60000.0);

        // print out information about all Employee objects

        for (Employee e : staff) {
            e.setId();
            System.out.println("Name=" + e.getName() + ", " + "id=" + e.getId() + " ,salary=" + e.getSalary());
        }
        System.out.println(Employee.getNextId());
    }
}

class Employee {
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s) {
        name = n;
        salary = s;
        id = 0;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void main(String[] args) {
        // unit test
        Employee employee = new Employee("harry", 50000);
        System.out.println(employee.getName() + "  " + employee.getSalary());
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

    public void setId() {
        id = nextId; //set to next available id
        nextId++;
    }
}
