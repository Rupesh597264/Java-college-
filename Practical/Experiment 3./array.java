import java.util.Scanner;
class array{
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
	int max = arr[0];
	int min = arr[0];
	for(int i=0;i<n;i++){
		if(arr[i]>max){
			max = arr[i];
		}
		if(arr[i]<min){
			min = arr[i];
		}
	}
	System.out.println("\nLargest element = "+max);
	System.out.print("Smallest element = "+min);
	}
}