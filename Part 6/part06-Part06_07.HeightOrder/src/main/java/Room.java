import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        if (this.persons.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (getPersons().size() == 0) {
            return null;
        }

        Person shortest = this.persons.get(0);
        for (Person i: this.persons) {
            if (i.getHeight() < shortest.getHeight()) {
                shortest = i;
            }
        }

        return shortest;
    }

    public Person take() {
        if (getPersons().size() == 0) {
            return null;
        }

        Person shortest = shortest();
        this.persons.remove(shortest);
        return shortest;
    }
}
