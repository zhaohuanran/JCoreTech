package CH5.abstractClasses;

/**
 * this program demonstrates abstract classes.
 *
 * @author nauh
 * @version 1.01 2019-06-13
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        // file the people arrays with the Student and Employee objects.
        people[0] = new Student("Maryy", "CS");
        people[1] = new Employee("Harry", 40000, 2011, 3, 4);
        people[2] = new Employee("Sakura", 40000, 2011, 3, 4);
        // print out names and descriptions of all person objects.
        for (Person p : people
        ) {
            System.out.println(p.getName() + "," + p.getDescription());
        }
        boolean b, b1;
        b = people[1].equals(people[0]);
        b1 = people[2].equals(people[1]);
        System.out.println(b + "  " + b1);
    }
}
