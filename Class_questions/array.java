import java.util.Scanner;
class array{
	public static void main(String args[]){
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
	int sum = 0;
	System.out.println();
	System.out.print("Sum of all elements of an array = ");
	for(int i=0;i<n;i++){
		sum+=arr[i];
	}System.out.println(sum);
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
	System.out.println("Largest element = "+max);
	System.out.print("Smallest element = "+min);
	}
}