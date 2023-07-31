
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects

    public boolean equals(Object person) {
        if (this == person) {
            return true;
        }

        if (!(person instanceof Person)) {
            return false;
        }

        Person newPerson = (Person) person;

        if (newPerson.birthday.equals(this.birthday) &&
        newPerson.name.equals(this.name) &&
        newPerson.height == this.height &&
        newPerson.weight == this.weight) {
            return true;
        } else {
            return false;
        }
    }
}
