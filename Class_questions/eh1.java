import java.util.Scanner;
import java.lang.*;
class eh1{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 1st number = ");
	int a = sc.nextInt();
	System.out.println("Enter 2nd number = ");
	int b = sc.nextInt();
	if(b==0){
	try{
		int data = a/b;
	}catch(ArithmeticException e){
		System.out.println(e);
	}
	}
	else{
	System.out.println(a/b);
	}
	}
}