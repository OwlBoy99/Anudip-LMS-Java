package program;
class Person {
    public String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void speak() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}
class Studentt extends Person {
    private String grade;
    
    public Studentt(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    public void study() {
        System.out.println(name +" is a student in grade " + grade + " and is studying.");
    }
}
public class InheritanceAssign2 {
    public static void main(String[] args) {
        // Create a Student object
        Studentt studentt = new Studentt("Alice", 18, "12th");
        // Call the "speak" and "study" methods of the Student object
        studentt.speak();
        studentt.study();
    }
}
