import java.util.Scanner;
class whiletable{
	public static void main(String args[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter a no. = ");
	int n = sc.nextInt();
	int t=1;
	int i=1;
	System.out.println("Table of 3 = ");
	while(i<=n){
		t=i*3;
	System.out.println("3 * " + i + " = " + t);
	i++;
	}
	}
}