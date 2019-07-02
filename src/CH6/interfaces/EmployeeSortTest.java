package CH6.interfaces;

import java.util.Arrays;

/**
 * This program demonstrates the use of Comparable interfaces.
 *
 * @author Nauh
 * @version 1.30 2019-07-02
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75500);
        staff[2] = new Employee("Tony Tester", 38000);
        Arrays.sort(staff);
        // print out information about about all Employee objects
        for (Employee e : staff
        ) {
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());

        }
    }
}
