import java.util.Scanner;
class circle{
	public double a;
	public void cir(){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the radius = ");
	a = sc.nextDouble();
	}
	public void show(){
	double area = a*a*3.14;
	System.out.print("Area = "+area);
	}
}
class CircleDemo{
	public static void main(String args[]){
		circle c = new circle();
		c.cir();
		c.show();
	}
}