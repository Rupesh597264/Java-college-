import java.util.Scanner;
class Tele{
	public static void main(String args[]){
	System.out.println("Rupesh Saini");
	System.out.println("24CSU259");
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of array = ");
	int n = sc.nextInt();
	int arr[] = new int[n];
	System.out.print("Enter the elements = ");
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++){
		System.out.print(arr[i]+" ");
	}
	System.out.print("\nEnter the target element = ");
	int a = sc.nextInt();
	for( int i=0;i<n;i++){
		if(a==arr[i]){
			System.out.print("\nTarget element is at index = "+(i+1));
		}
	}
	}
}