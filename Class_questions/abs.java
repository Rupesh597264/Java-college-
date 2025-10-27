import java.util.Scanner;
abstract class Shape{
	abstract double getArea();
}
class Rectangle extends Shape{
	int length;
	int breadth;
	double getArea(){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter length and breadth = ");
	length = sc.nextInt();
	breadth = sc.nextInt();
	int a = length*breadth;
	System.out.print("Area of rectangle = "+a);
	return a;
	}
}
class Circle extends Shape{
	int radius;
	double getArea(){
	Scanner sc = new Scanner (System.in);
	System.out.print("\nEnter radius = ");
	radius = sc.nextInt();
	double a = (3.14f*radius*radius);
	System.out.print("Area of Circle = "+a);
	return a;
	}
}
class abs{
	public static void main(String args[]){
	Shape b = new Rectangle();
	b.getArea();
	Shape c = new Circle();
	c.getArea();
	}
}