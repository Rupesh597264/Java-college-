import java.util.Scanner;
class duplicate{
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
	System.out.print("\nArray after removing duplicate = ");
	boolean dup = false;
	for(int i=0;i<n;i++){
       for(int j=0;j<i;j++){
    	if(arr[i]==arr[j]){
    		dup = true;
    		break;
    	}
    }
    if(!dup){
        System.out.print(arr[i] + " ");
    }
	}
	}
}