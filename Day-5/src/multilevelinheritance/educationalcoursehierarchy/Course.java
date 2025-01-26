package multilevelinheritance.educationalcoursehierarchy;

public class Course {
    // declaring attributes
    String courseName;
    int duration;

    // Constructor of parent class
    Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayDetails(){
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration : " + duration);
    }
}
