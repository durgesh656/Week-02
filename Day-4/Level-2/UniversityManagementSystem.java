import java.util.ArrayList;

class Course {
    private String courseName;
    private Professor professor;
    private ArrayList<Student> students;

    // Constructor to initialize the course
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Assign a professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getName() + " assigned to the course: " + courseName);
    }

    // Enroll a student in the course
    public void enrollStudent(Student student) {
        students.add(student);
        student.addCourse(this); // Associate the course with the student
        System.out.println("Student " + student.getName() + " enrolled in the course: " + courseName);
    }

    // Display course details
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Taught by: " + professor.getName());
        } else {
            System.out.println("No professor assigned yet.");
        }
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

class Professor {
    private String name;
    private String department;

    // Constructor to initialize professor details
    public Professor(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // Display professor details
    public void displayProfessorDetails() {
        System.out.println("Professor: " + name + ", Department: " + department);
    }
}



class Student {
    private String name;
    private int studentID;
    private ArrayList<Course> courses;

    // Constructor to initialize student details
    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
        this.courses = new ArrayList<>();
    }

    // Enroll the student in a course
    public void addCourse(Course course) {
        courses.add(course);
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    // Display student's enrolled courses
    public void displayEnrolledCourses() {
        System.out.println("Student: " + name + " (ID: " + studentID + ") is enrolled in:");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create courses
        Course c1 = new Course("Math ");
        Course c2= new Course("Computer Science ");

        // Create professors
        Professor p1 = new Professor("John", "Mathematics");
        Professor p2 = new Professor("Harry", "Computer Science");

        // Assign professors to courses
        c1.assignProfessor(p1);
        c2.assignProfessor(p2);

        // Create students
        Student s1 = new Student("Rahul", 1);
        Student s2 = new Student("Happy", 2);

        // Enroll students in courses
        c1.enrollStudent(s1);
        c2.enrollStudent(s1);
        c2.enrollStudent(s2);

        // Display course details
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Display student details
        s1.displayEnrolledCourses();
        s2.displayEnrolledCourses();
    }
}
