

public class Circles{
    public static void main(String[]args) {
        CircleArea circle=new CircleArea(14);
        double area=circle.displayArea();
        double circumference=circle.displayCircumference();
        System.out.println("Area of circle with radius 14 is: "+area+"\nCircumference of a circle with radius 14 is: "+circumference);
       

    }
}

class CircleArea{
    private double radius;
    CircleArea(double radii){
        this.radius=radii;
    }
    double displayArea(){
        double area=3.14*radius*radius;
        return area;
    }
    double displayCircumference(){
        double circumference=2*3.14*radius;
        return circumference;
    }
}

