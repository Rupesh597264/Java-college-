import java.util.Scanner;
class student{
	Scanner sc = new Scanner(System.in);
	public String name;
	public int roll_no;
	public void in(){
	System.out.print("Enter name = ");
	name = sc.nextLine();
	System.out.print("Enter roll no. = ");
	roll_no = sc.nextInt();
	}
	public void show(){
	System.out.println("Name = "+name);
	System.out.print("Roll no. = "+roll_no);
	}
}
class st{
	public static void main(String args[]){
	System.out.println("Rupesh Saini");
	System.out.println("24CSU259");
	student a = new student();
	a.in();
	a.show();
	}
}