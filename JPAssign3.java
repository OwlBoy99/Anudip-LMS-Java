package program;
import java.util.Scanner;

class Subject {
    private String name;
    private int marks;

    public Subject(String name) {
        this.name = name;
        this.marks = 0;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}

class Student {
    private String name;
    private int rollNumber;
    private Subject[] subjects;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        subjects = new Subject[2];
        subjects[0] = new Subject("Maths");
        subjects[1] = new Subject("English");
    }

    public void setMarks(int mathMarks, int englishMarks) {
        subjects[0].setMarks(mathMarks);
        subjects[1].setMarks(englishMarks);
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public Subject[] getSubjects() {
        return subjects;
    }
}

class Teacher {
    public void setMarks(Student student, int mathMarks, int englishMarks) {
        student.setMarks(mathMarks, englishMarks);
    }
}

public class JPAssign3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instantiate 10 students
        Student[] students = new Student[10];
        for (int i = 0; i < 10; i++) {
            students[i] = new Student("Student " + (i + 1), i + 1);
        }

        // Instantiate a teacher
        Teacher teacher = new Teacher();

        // Set marks for each student
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Math marks for " + students[i].getName() + ": ");
            int mathMarks = scanner.nextInt();
            System.out.print("Enter English marks for " + students[i].getName() + ": ");
            int englishMarks = scanner.nextInt();
            teacher.setMarks(students[i], mathMarks, englishMarks);
        }

        // Calculate average marks
        int totalMathMarks = 0;
        int totalEnglishMarks = 0;
        for (int i = 0; i < 10; i++) {
            totalMathMarks += students[i].getSubjects()[0].getMarks();
            totalEnglishMarks += students[i].getSubjects()[1].getMarks();
        }
        double averageMathMarks = (double) totalMathMarks / 10;
        double averageEnglishMarks = (double) totalEnglishMarks / 10;

        // Find max and min marks
        int maxMathMarks = students[0].getSubjects()[0].getMarks();
        int minMathMarks = students[0].getSubjects()[0].getMarks();
        int maxEnglishMarks = students[0].getSubjects()[1].getMarks();
        int minEnglishMarks = students[0].getSubjects()[1].getMarks();
        for (int i = 1; i < 10; i++) {
            int mathMarks = students[i].getSubjects()[0].getMarks();
            int englishMarks = students[i].getSubjects()[1].getMarks();

            if (mathMarks > maxMathMarks) {
                maxMathMarks = mathMarks;
            }
            if (mathMarks < minMathMarks) {
                minMathMarks = mathMarks;
            }
            if (englishMarks > maxEnglishMarks) {
                maxEnglishMarks = englishMarks;
            }
            if (englishMarks < minEnglishMarks) {
                minEnglishMarks = englishMarks;
            }
        }

        // Display results
        System.out.println("Average Math Marks: " + averageMathMarks);
        System.out.println("Average English Marks: " + averageEnglishMarks);
        System.out.println("Max Math Marks: " + maxMathMarks);
        System.out.println("Min Math Marks: " + minMathMarks);
        System.out.println("Max English Marks: " + maxEnglishMarks);
        System.out.println("Min English Marks: " + minEnglishMarks);

        scanner.close();
    }
}
