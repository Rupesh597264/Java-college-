import java.util.Scanner;
class fac{
	public int a;
	public int cal(int a){
		if(a==0||a==1)
			return 1;
		else{
			return a*(cal(a-1));
		}
	}
}
class recfac{
	public static void main(String args[]){
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter a no. = ");
		int a=sc.nextInt();
		fac b = new fac();
		System.out.print("Factorial = "+b.cal(a));
	}
}