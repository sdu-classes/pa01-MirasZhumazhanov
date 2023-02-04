public class Circle {
    private double radius = 1.0;

    public Circle(){
    }

    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }
    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }
    public String toString(){
        return "This is circle with radius " + this.radius + ", Area " + getArea() + " and Circumference " + getCircumference();
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(25);
        System.out.println(c1.toString());
    }
}

