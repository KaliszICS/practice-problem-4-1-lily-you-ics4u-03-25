public class Circle {
    //instances
    private double radius;

    //constructor
    public Circle(double radius){
        this.radius = radius;
    }

    //getters
    public double getRadius(){
        return this.radius;
    }

    //methods
    public double area(){
        return 3.14*(radius*radius);
    }

    public double circumference(){
        return 2*3.14*radius;
    }
}
