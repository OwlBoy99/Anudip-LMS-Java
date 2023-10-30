package program;
import java.util.ArrayList;

class person {
    private String name;
    private int age;
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
public class CollectionAssign3 {
    public static void main(String[] args) {
        ArrayList<person> personList = new ArrayList<>();

        // Populate the ArrayList with 10 Person objects
        personList.add(new person("Alice", 25));
        personList.add(new person("Bob", 30));
        personList.add(new person("Charlie", 35));
        personList.add(new person("David", 40));
        personList.add(new person("Eve", 45));
        personList.add(new person("Frank", 50));
        personList.add(new person("Grace", 55));
        personList.add(new person("Helen", 60));
        personList.add(new person("Ivy", 65));
        personList.add(new person("Jack", 70));

        // Print the elements using a for-each loop
        System.out.println("List of Persons:");
        for (person person1 : personList) {
            System.out.println(person1);
        }
    }
}
