

class Student {
    // class attributes
    private static String universityName = "RGPV University";
    private static int totalStudents = 0; 

    // Instance variables
    private final int rollNumber; // Final variable  roll number
    private  String name;
    private String grade;
    
        // Constructor to initialize instance variables
        public Student(String name, int rollNumber, String grade) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.grade = grade;
    
            // Increment total students count
            totalStudents++;
        }
    
        // Static method to display total students enrolled
        public static void displayTotalStudents() {
            System.out.println("Total Students Enrolled: " + totalStudents);
            System.out.println();
        }
    
        // Method to display student details
        public void displayStudentDetails() {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
            System.out.println("University: " + universityName);
            System.out.println();
        }
    
        // Static method to update grade only if it's a Student class object)
        public  void updateGrade(Object student1, String newGrade) {
            if (student1 instanceof Student) {
                grade = newGrade;
                System.out.println("Grade updated for " + name + " to " + newGrade + ".");
                System.out.println();
        } else {
            System.out.println("The object is not an instance of the Student class.");
            System.out.println();
        }
    }
}

public class UniversityStudentManagementSystem {
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student("Shyam", 101, "A");
        Student student2 = new Student("Ram", 102, "B");

        // Display details of students
        student1.displayStudentDetails();
        
        student2.displayStudentDetails();

        // Display total students
        Student.displayTotalStudents();

        // Update grade using the static method
        student1.updateGrade(student1, "A+");
        student2.updateGrade(student2, "A+");

        student1.displayStudentDetails();

    }
}

