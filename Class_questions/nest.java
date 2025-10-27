import java.util.Scanner;
class out{
	static class in{
	public static void show(){
			System.out.println("Hello world, this is the example of a nested static class.");
		}
	}
}
class nest{
	public static void main(String args[]){
		out.in.show();
	}
}