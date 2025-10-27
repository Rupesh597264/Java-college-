class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }
}
public class abs8 {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape s = new Square(); 

        c.draw();
        s.draw();
    }
}