package CH5.abstractClasses;

import java.time.LocalDate;
import java.util.Objects;

public class Employee extends Person {
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public String getDescription() {
        return String.format("an employee with a salary of $%.2f", salary);
    }

    public void rasieSalary(double byPercent) {
        double raise = salary * byPercent;
        salary += raise;
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject)
            return true;
        if (otherObject == null)
            return false;
        if (getClass() != otherObject.getClass())
            return false;
        Employee other = (Employee) otherObject;
        return Objects.equals(name, other.name)
                && salary == other.salary
                && hireDay.equals(other.hireDay);
    }
}
