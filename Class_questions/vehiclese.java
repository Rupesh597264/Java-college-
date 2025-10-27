class Vehicle{
	int make;
	String model;
	Vehicle (int make, String model){
		this.make = make;
		this.model = model;
	}
	void display(){
		System.out.println("Make = "+make+"\n"+"Model = "+model);
	}
}
class Bike extends Vehicle{
	Bike(int make, String model){
		super(make,model);
	}
	void display(){
		System.out.println("This is bike");
		System.out.println("Make = "+make+"\n"+"Model = "+model);
	}
}
class Car extends Vehicle{
	Car(int make, String model){
		super(make,model);
	}
	void display(){
		System.out.println("This is car");
		System.out.println("Make = "+make+"\n"+"Model = "+model);
	}
}class vehiclese{
	public static void main(String args[]){
		Vehicle v[] = new Vehicle[2];
		v[0] = new Bike(21,"platinum");
		v[1] = new Car(22,"Skoda");
		v[0].display();
		v[1].display();
	}
}