import java.util.Scanner;
class Calculator
{
	public static void main(String args[]){
	System.out.println("Rupesh Saini");
	System.out.println("24CSU259");
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter 1st no. = ");
	int a = sc.nextInt();
	System.out.print("Enter 2nd no. = ");
	int b = sc.nextInt();
	int sum =a+b;
	System.out.print("\nAddition of two numbers = "+sum);
	int dif =a-b;
	System.out.print("\nDifference of two numbers = "+dif);
	int pro =a*b;
	System.out.print("\nMultiplication of two numbers = "+pro);
	int div =a/b;
	System.out.print("\nDivision of two numbers = "+div);
	}
}