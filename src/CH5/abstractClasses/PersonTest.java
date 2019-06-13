package CH5.abstractClasses;

/**
 * this program demonstrates abstract classes.
 *
 * @author nauh
 * @version 1.01 2019-06-13
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        // file the people arrays with the Student and Employee objects.
        people[0] = new Student("Maryy", "CS");
        people[1] = new Employee("Harry", 40000, 2011, 3, 4);
        // print out names and descriptions of all person objects.
        for (Person p : people
        ) {
            System.out.println(p.getName() + "," + p.getDescription());
        }
    }
}
