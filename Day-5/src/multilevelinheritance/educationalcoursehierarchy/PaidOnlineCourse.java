package multilevelinheritance.educationalcoursehierarchy;

public class PaidOnlineCourse extends OnlineCourse{
    int fee;
    int discount;

    PaidOnlineCourse(String courseName, int duration, String plateForm, boolean isRecorded, int fee, int discount){
        super(courseName, duration, plateForm, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Overridden method
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Course Fee : " + fee);
        System.out.println("Discount : " + discount+"%");
    }
}
