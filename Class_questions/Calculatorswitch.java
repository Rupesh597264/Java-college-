import java.util.Scanner;
class Calculatorswitch
{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter 1st no. = ");
	int a = sc.nextInt();
	System.out.print("Enter 2nd no. = ");
	int b = sc.nextInt();
	System.out.print("Enter your choice of operation = ");
	int c = sc.nextInt();
	switch (c){
	case 1:
	int sum =a+b;
	System.out.print("Addition of two numbers = "+sum);
	break;
	case 2:
	if(a>b){
	int dif =a-b;
	System.out.print("Difference of two numbers = "+dif);
	}
	else if(a<b){
	int dif =b-a;
	System.out.print("Difference of two numbers = "+dif);
	}
	else{
	System.out.print("Difference of two numbers = 0");
	}
	break;
	case 3:
	int pro =a*b;
	System.out.print("Multiplication of two numbers = "+pro);
	break;
	case 4:
	if(a>b){
	int div =a/b;
	System.out.print("Division of two numbers = "+div);
	}
	else if(a<b){
	int div =b/a;
	System.out.print("Division of two numbers = "+div);
	}
	else{
	System.out.print("Division of two numbers = 1");
	}
	break;
}
	}
}