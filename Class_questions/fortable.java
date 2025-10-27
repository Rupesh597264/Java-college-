import java.util.Scanner;
class fortable{
	public static void main(String args[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter a no. = ");
	int n = sc.nextInt();
	int t=1;
	for(int i=1;i<=n;i++){
		t=i*3;
	System.out.println(t);
	}
	}
}