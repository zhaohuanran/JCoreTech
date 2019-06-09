package CH4.com.nauh;
// the Employee class is defined in that package

import static java.lang.System.out;

/**
 * This program demonstrates the use of package.
 *
 * @author Nauh
 * @version 1.11 2019-060-09
 */
public class PackageTest {
    public static void main(String[] args) {
        Employee Harry = new Employee("Harry Hacker", 50000, 2099, 12, 23);
        Harry.raiseSalary(5);
        out.println("name=" + Harry.getName() + ",salary=" + Harry.getSalary() + ",hire date=" + Harry.getHireDay());
    }
}
