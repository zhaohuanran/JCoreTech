package CH5.abstractClasses;

public abstract class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    public String getName() {
        return name;
    }
}
