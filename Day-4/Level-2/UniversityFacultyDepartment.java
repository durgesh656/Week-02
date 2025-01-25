import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private List<Faculty> faculties;

    public Department(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public String getName() {
        return name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }
}

class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public String getName() {
        return name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void deleteUniversity() {
        departments.clear();
    }
}

public class UniversityFacultyDepartment {
    public static void main(String[] args) 
    {
        // Create Faculty members
        Faculty faculty1 = new Faculty("John");
        Faculty faculty2 = new Faculty("Happy");

        // Create Departments
        Department csDepartment = new Department("Computer Science");
        Department mathDepartment = new Department("Mathematics");

        // Add Faculty to Departments
        csDepartment.addFaculty(faculty1);
        mathDepartment.addFaculty(faculty2);

        // Create University
        University university = new University("RGPV University");

        // Add Departments to University
        university.addDepartment(csDepartment);
        university.addDepartment(mathDepartment);

        // Display University details
        System.out.println("University: " + university.getName());
        for (Department dept : university.getDepartments()) {
            System.out.println("Department: " + dept.getName());
            for (Faculty faculty : dept.getFaculties()) {
                System.out.println("Faculty: " + faculty.getName());
            }
        }

        // Delete University and its Departments
        university.deleteUniversity();
        System.out.println("University deleted. Departments: " + university.getDepartments().size());

        // Faculty members still exist independently
        System.out.println("Independent Faculty: " + faculty1.getName());
        System.out.println("Independent Faculty: " + faculty2.getName());
    }
}