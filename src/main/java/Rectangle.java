public class Rectangle{
    //instance Variables
    private double length;
    private double width;

    //constructor
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    //getters
    public double getLength(){
        return this.length;
    }

    public double getWidth(){
        return this.width;
    }

    //methods
    public double area(){
        return this.length*this.width;
    }

    public double perimeter(){
        if(length == 0 || width == 0){
            return 0;
        }
        return 2*(this.length + this.width);
    }
}