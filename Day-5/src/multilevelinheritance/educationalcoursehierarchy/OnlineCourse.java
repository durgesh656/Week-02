package multilevelinheritance.educationalcoursehierarchy;

public class OnlineCourse extends Course{
    String plateForm;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String plateForm, boolean isRecorded){
        super(courseName, duration);
        this.plateForm = plateForm;
        this.isRecorded = isRecorded;
    }

    // Overridden method
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Platform Name : " + plateForm);
        System.out.println("Are there recoded lectures : " + isRecorded);
    }
}
