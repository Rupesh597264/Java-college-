import java.util.Scanner;
class Vehicle{
	void display(){
		System.out.println("This is a vehicle");
	}
}
class Car extends Vehicle{
	void display(){
		System.out.println("This is a car");
	}

}
class Bike extends Vehicle{
	void display(){
		System.out.println("This is a bike");
	}
}
class Q2{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Rupesh Saini");
	System.out.println("24CSU259");
	int N = sc.nextInt();
	if(N==2){
		Bike a = new Bike();
		a.display();
	}
	else if(N==4){
		Car a = new Car();
		a.display();
	}
	else{
		Vehicle a = new Vehicle();
		a.display();
	}
	}
}