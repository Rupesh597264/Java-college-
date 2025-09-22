import java.util.Scanner;
class Adddigit{
	public static void main(String args[]){
		System.out.println("Rupesh Saini");
		System.out.println("24CSU259");
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a no. = ");
		int a = sc.nextInt();
		int d1 = a%10;
		int d2 = (a/10)%10;
		int d3 = a/100;
		int sum = d1+d2+d3;
		System.out.print("Sum of all digits = "+sum);
	}
}