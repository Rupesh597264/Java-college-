import java.util.Scanner;
class Circle{
	public double r;
	public double area;
	Circle(double r){
		this.r = r;
	}
	public void cal(){
		area = r*r*3.4f;
	}
	public void show(){
		System.out.print("Area = "+area);
	}
}
class Pcircle{
	public static void main(String args[]){
		Circle c[] = new Circle[2];
		c[0] = new Circle(4.0);
		c[0].cal();
		c[0].show();
		c[1] = new Circle(2.0);
		c[1].cal();
		c[1].show();
	}
}