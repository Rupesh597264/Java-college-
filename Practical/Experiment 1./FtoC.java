import java.util.Scanner;
class FtoC{
	public static void main(String args[]){
	System.out.println("Rupesh Saini");
	System.out.println("24CSU259");
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Temperature = ");
		int a = sc.nextInt();
		float c = (a-32)*(5.0f/9.0f);
		System.out.print("Temperature in celsius = "+c);
	}
}