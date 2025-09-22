import java.util.Scanner;
class Shape{
	Scanner sc = new Scanner(System.in);
	Shape(){
		System.out.println("This is this is shape");
	}
}
class Rectangle extends Shape{
	Rectangle(){
		System.out.println("This is rectangular shape");
	}
}
class Square extends Rectangle{
	Square(){
		System.out.println("Square is a rectangle");
	}
}
class Circle extends Shape{
	Circle(){
		System.out.println("This is Circular shape");
	}
}
class Q1{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Rupesh Saini");
	System.out.println("24CSU259");
	Square a = new Square();
	Circle b = new Circle();
	}
}