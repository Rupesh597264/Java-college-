import java.util.Scanner;
class Out{
	int x = 10;
	class in{
		void display(){
		System.out.println("jhdksjneku"+x);
	}}
}
class Nestedclass{
	public static void main(String args[]){
		Out o = new Out();
		Out.in i = o.new in();
		i.display();
	}
}