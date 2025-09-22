import java.util.Scanner;
class Complex{
	public double a;
	public double b;
	public double c;
	public double d;
	public void in(){		
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter real part of 1st complex no. = ");
	a = sc.nextInt();
	System.out.print("Enter imaginary part of 1st complex no. = ");
	b = sc.nextInt();
	System.out.print("Enter real part of 2nd complex no. = ");
	c = sc.nextInt();
	System.out.print("Enter imaginary part of 2nd complex no. = ");
	d = sc.nextInt();
	}
	public void show(){
	System.out.println("1st complex no. = "+a+"+"+b+"i");
	System.out.println("2nd complex no. = "+c+"+"+d+"i");
	}
	public void sum(){
	System.out.println("Sum of both complex numbers = "+(a+c)+"+"+(b+d)+"i");
	}
	public void dif(){
	System.out.println("Difference of both complex numbers = "+(a-c)+"+"+(b-d)+"i");
	}
	public void pro(){
	System.out.print("Product of both complex numbers = "+(a*c)+"+"+(b*d)+"i");
	}
}
class arith{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Rupesh Saini");
	System.out.println("24CSU259");
	Complex a = new Complex();
	a.in();
	a.show();
	a.sum();
	a.dif();
	a.pro();
	}
}