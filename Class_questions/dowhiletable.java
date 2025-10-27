import java.util.Scanner;
class dowhiletable{
	public static void main(String args[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter a no. = ");
	int n = sc.nextInt();
	int t=1;
	int i=1;
	do{
		t=i*3;
	System.out.println(t);
	i++;
	}while(i<=n);
	}
}