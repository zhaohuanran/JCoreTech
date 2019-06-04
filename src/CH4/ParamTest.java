package CH4;


public class ParamTest {
    public static void main(String[] args) {
        /*
         *  Test 1:Methods can't modify numeric parameters
         */
        System.out.println("Test tripleValue:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);
        /*
         * Test 2;Methods can change the state of object parameters
         */
        System.out.println("\nTest tripleSalary:");
        employee harry = new employee("Harry", 50000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());
        /*
         *Test3 Methods can't attach new objects to objects parameters
         */
        System.out.println("\nTest swap");
        employee a = new employee("Alice", 70000);
        employee b = new employee("Bob", 70000);
        System.out.println("Before:a=" + a.getName());
        System.out.println("Before:b=" + b.getName());
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void tripleValue(double x) { // doesn't work
        x = x * 3;
        System.out.println("End of method: x=" + x);
    }

    public static void tripleSalary(employee x) //works
    {
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }

    public static void swap(employee x, employee y) {
        employee temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }
}

class employee { // simplified employee class
    private String name;
    private double salary;

    public employee(String n, double s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percent) {
        double raise = salary * percent / 100;
        salary += raise;
    }
}
