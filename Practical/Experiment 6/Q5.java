import java.util.Scanner;
abstract class Marks{
	abstract void getPercentage();
}
class A extends Marks{
	int a,b,c;
	A(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	void getPercentage(){
		System.out.println("Percentage of student A = "+(a+b+c)/3+"%");
	}
}
class B extends Marks{
	int a,b,c,d;
	B(int a, int b, int c, int d){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	void getPercentage(){
		System.out.println("Percentage of student B = "+(a+b+c+d)/4+"%");
	}
}
class Q5{
	public static void main(String args[]){
		System.out.println("Rupesh Saini\n24CSU259");
		int a,b,c,d,e,f,g;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter marks for three subjects of student A = ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.print("Enter marks for four subjects of student B = ");
		d = sc.nextInt();
		e = sc.nextInt();
		f = sc.nextInt();
		g = sc.nextInt();
		A st = new A(a,b,c);
		st.getPercentage();
		B stu = new B(d,e,f,g);
		stu.getPercentage();
	}
}