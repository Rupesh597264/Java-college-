import java.util.Scanner;
class Area{
	public double l;
	public double b;
	public double area;
	Area(double l, double b){
		this.l=l;
		this.b=b;
	}
	public void returnArea(){
	area = l*b;
	System.out.print("Area = "+area);
	}
}
class rectangle{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Rupesh Saini");
	System.out.println("24CSU259");
	System.out.print("Enter length = ");
	int c = sc.nextInt();
	System.out.print("Enter breadth = ");
	int d = sc.nextInt();
	Area a = new Area(c,d);
	a.returnArea();
	}
}