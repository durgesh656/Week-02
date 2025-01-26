package multilevelinheritance.educationalcoursehierarchy;

public class Main {
    public static void main(String[] args) {
        // Object of Course class
        Course course = new Course("Java FullStack", 6);
        course.displayDetails();
        System.out.println();

        // Object of OnlineCourse class
        OnlineCourse onlineCourse = new OnlineCourse("Java FullStack", 6, "YouTube", true);
        onlineCourse.displayDetails();
        System.out.println();

        // Object of PaidOnlineCourse class
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Java FullStack", 6, "YouTube", true, 15000, 10);
        paidOnlineCourse.displayDetails();
    }
}
