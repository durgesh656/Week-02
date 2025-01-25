import java.util.ArrayList;

// Class Student
class Student {
    private String name;
    private int studentID;
    private ArrayList<Subject> subjects;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }
}

//  Class  Subject
class Subject {
    private String subjectName;
    private double marks;

    public Subject(String subjectName, double marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public double getMarks() {
        return marks;
    }
}

// Class  Grade Calculator
class GradeCalculator {

    public String calculateGrade(Student student) {
        ArrayList<Subject> subjects = student.getSubjects();
        if (subjects.isEmpty()) {
            return "No subjects available to calculate grades.";
        }

        double totalMarks = 0;
        for (Subject subject : subjects) {
            totalMarks += subject.getMarks();
        }
        double average =  totalMarks / subjects.size();

        if (average >= 90) {
            return "A";
        }
        else if (average >= 75) {
            return "B";
        }
        else if (average >= 50) {
            return "C";
        }
        else {
            return "F";
        }
    }
}


public class SchoolResult {
    public static void main(String[] args) {
        // Create a student object
        Student s1 = new Student("John", 1);

        // Create subject objects
        Subject subject1 = new Subject("Maths", 90);
        Subject subject2 = new Subject("Science", 85);

        // Add subjects to the student
        s1.addSubject(subject1);
        s1.addSubject(subject2);

        // Display object details
        System.out.println("Student: " + s1.getName());
        System.out.println("Subjects and Marks:");
        for (Subject subject : s1.getSubjects()) {
            System.out.println("- " + subject.getSubjectName() + ": " + subject.getMarks());
        }

        GradeCalculator gradeCalculator = new GradeCalculator();
        System.out.println(s1.getName()+"'s Grade: " + gradeCalculator.calculateGrade(s1));

    }
}
