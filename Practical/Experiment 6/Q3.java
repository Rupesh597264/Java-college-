abstract class Shape {
    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}
class Area extends Shape {
    void RectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
    void SquareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square = " + area);
    }
    void CircleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}
public class Q3{
    public static void main(String[] args) {
        System.out.println("Rupesh Saini\n24CSU259");
        Area obj = new Area();
        obj.RectangleArea(10, 5);  
        obj.SquareArea(4);         
        obj.CircleArea(3);         
    }
}