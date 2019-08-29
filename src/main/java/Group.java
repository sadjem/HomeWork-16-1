import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Person> persons = new ArrayList<Person>();

    public Group(String name) {
        this.name = name;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", persons=" + persons +
                '}';
    }
}
