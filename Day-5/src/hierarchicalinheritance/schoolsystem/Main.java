package hierarchicalinheritance.schoolsystem;

public class Main {
    public static void main(String[] args) {
        // object of Person class
        Person person = new Person("John", 23);
        person.displayRole();
        System.out.println();

        // object of Teacher class
        Teacher teacher = new Teacher("Alice", 30, " Math");
        teacher.displayRole();
        System.out.println();

        // object of Student class
        Student student = new Student("Bob", 20, 'A');
        student.displayRole();
        System.out.println();

        // object of Staff class
        Staff staff = new Staff("Peter", 26, "IT department");
        staff.displayRole();
        System.out.println();
    }
}
