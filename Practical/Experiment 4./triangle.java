import java.util.Scanner;
class tr{
	Scanner sc = new Scanner(System.in);
	public double p;
	public double b;
	public double h;
	public double peri;
	public double area;
	tr(){
		p=3;
		b=4;
		h=5;
	}
	public void ca(){
	peri = p+b+h;
	System.out.println("Perimeter = "+peri);
	area = (1/2f)*b*p;
	System.out.print("Area = "+area);
	}
}
class triangle{
	public static void main(String args[]){
	System.out.println("Rupesh Saini");
	System.out.println("24CSU259");
	tr a = new tr();
	a.ca();
	}
}