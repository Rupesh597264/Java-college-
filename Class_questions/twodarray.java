import java.util.Scanner;
class twodarray{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of array = ");
	int n = sc.nextInt();
	int arr[][] = new int[n][n];
	System.out.print("Enter the elements = ");
	for(int i=0;i<n;i++){
		for( int j=0;j<n;j++){
		arr[i][j]=sc.nextInt();
	}
	}
	for(int i=0;i<n;i++){
		for( int j=0;j<n;j++){
		System.out.print(arr[i][j]+" ");
	}System.out.print("\n");
	}
	System.out.print("\nEnter the size of 2nd array = ");
	int a = sc.nextInt();
	int arr2[][] = new int[a][a];
	System.out.print("Enter the elements = ");
	for(int i=0;i<a;i++){
		for( int j=0;j<a;j++){
		arr2[i][j]=sc.nextInt();
	}
	}
	for(int i=0;i<a;i++){
		for( int j=0;j<a;j++){
		System.out.print(arr2[i][j]+" ");
	}System.out.print("\n");
	}
	int s =0;
	System.out.println("\nSum of both arrays = ");
	for(int i=0;i<a;i++){
		for( int j=0;j<a;j++){
			s = arr[i][j]+arr2[i][j];
		System.out.print(s+" ");
		s=0;
	}System.out.print("\n");
	}
	int d =0;
	System.out.println("\nSubtraction of both arrays = ");
	for(int i=0;i<a;i++){
		for( int j=0;j<a;j++){
			d = arr[i][j]-arr2[i][j];
		System.out.print(d+" ");
		d=0;
	}System.out.print("\n");
	}
	int m =0;
	System.out.println("\nMultiplication of both arrays = ");
	int result[][] = new int [n][n];
	for(int i=0;i<n;i++){
		for( int j=0;j<a;j++){
			result[i][j]=0;
			for(int k=0;k<n;k++){
			result[i][j] += arr[i][k]*arr2[k][j];
	}	System.out.print(result[i][j]+" ");
	}System.out.print("\n");
	}
}
}