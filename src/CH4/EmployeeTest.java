package CH4;

import java.time.LocalDate;

/**
 * This program tests the Employee class
 *
 * @author Nauh
 * @version 1.12 2019-05-26
 */
public class EmployeeTest {
    public static void main(String[] args) {
        // file the staff array with three Employee objects
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Cat", 10000.0, 2016, 1, 1);
        staff[1] = new Employee("Dog", 11000.0, 2017, 2, 1);
        staff[2] = new Employee("Meo", 9000.0, 2018, 6, 30);
        // raise everyone's salary by 5%
        for (var e : staff) {
            e.raiseSalary(5);
        }
        // print out information about all Employee objects
        for (Employee s : staff) {
            System.out.println("name=" + s.getName() + ",salary=" + s.getSalary() + ",hireDay=" + s.getHireDay());
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double bypercent) {
        double raise = salary * bypercent / 100;
        salary += raise;

    }
}