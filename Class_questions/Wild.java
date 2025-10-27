class Animal{
	void sound(){
		System.out.println("This is animal");
	}
}
class Dog extends Animal{
	void sound(){
		System.out.println("This is dog");
	}
}
class Cat extends Animal{
	void sound(){
		System.out.println("This is cat");
	}}
class Wild{
	public static void main(String args[]){
		Animal a[] = new Animal[2];
		a[0] = new Dog();
		a[1] = new Cat();
		a[0].sound();
		a[1].sound();
	}
}