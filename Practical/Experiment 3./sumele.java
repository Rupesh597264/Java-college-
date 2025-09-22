import java.util.Scanner;
class sumele{
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
	int sum = 0;
	System.out.println();
	System.out.print("Sum of all elements of an array = ");
	for(int i=0;i<n;i++){
		sum+=arr[i];
	}System.out.println(sum);
	int sum2 = 0;
	for(int i=0;i<n;i++){
		if(arr[i]%2==0){
			sum2+=arr[i];
		}else{
			continue;
		}
	}
	System.out.print("Sum of alternate elements of an array = "+sum2);
	}
}