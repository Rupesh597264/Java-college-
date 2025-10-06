interface GeometricObject {
    double getPerimeter();
    double getArea();
}
interface Resizable {
    void resize(int percent);
}
class Circle implements GeometricObject {
    protected double radius = 1.0;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getPerimeter() {
        return 2 * 3.14f * radius;
    }
    public double getArea() {
        return 3.14f * radius * radius;
    }
    public String toString() {
        return "Circle\nradius=" + radius + 
               ",\narea=" + getArea() + 
               ",\nperimeter=" + getPerimeter()+"\n";
    }
}
class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }
    public void resize(int percent) {
        radius = radius * percent / 100.0;
    }
    public String toString() {
        return "ResizableCircle\nradius=" + radius + 
               ",\narea=" + getArea() + 
               ",\nperimeter=" + getPerimeter()+"\n";
    }
}
class Q2 {
    public static void main(String[] args) {
        System.out.println("Rupesh Saini");
        System.out.println("24CSU259");
        Circle c1 = new Circle(5.0);
        System.out.println(c1);
        ResizableCircle rc1 = new ResizableCircle(10.0);
        System.out.println(rc1);
        rc1.resize(50);
        System.out.println("After resizing to 50% = ");
        System.out.println(rc1);
    }
}