package program;
interface Person {
    void speak();
}

class Student implements Person {
    @Override
    public void speak() {
        System.out.println("I am a student, and I like to learn.");
    }
}

class Teacher implements Person {
    @Override
    public void speak() {
        System.out.println("I am a teacher, and I love to educate.");
    }
}

public class AbsIntAssign4 {
    public static void main(String[] args) {
        Person student = new Student();
        Person teacher = new Teacher();

        System.out.println("Student says:");
        student.speak();

        System.out.println("Teacher says:");
        teacher.speak();
    }
}

