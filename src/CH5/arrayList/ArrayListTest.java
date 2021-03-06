package CH5.arrayList;

import CH5.equals.Employee;

import java.util.ArrayList;

/**
 * This program demonstrate the ArrayList class
 *
 * @author Nauh
 * @version 1.11 2012-01-26
 */
public class ArrayListTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee objects
        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
        staff.add(new Employee("Tom Tester", 40000, 1990, 3, 15));

        //raise everyone's salary by 5%

        for (Employee e : staff
        ) {
            e.raiseSalay(5);
        }
        // print out information about all Employee objects
        for (Employee e : staff
        ) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" + e.getHireDay());
        }
    }
}
