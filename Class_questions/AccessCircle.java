import java.util.Scanner;
class AccessCircle{
	private double a;
	public void setradius(double a){
	this.a = a;
	}
	public double getradius(){
	return a;	
	}
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
		AccessCircle c = new AccessCircle();
		c.setradius(6.00);
		System.out.print(c.getradius());
		c.show();
	}
}