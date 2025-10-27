import java.util.Scanner;
class Box{
	public double width;
	public double height;
	public double depth;
	public void setDim(){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter width = ");
		width = sc.nextDouble();
		System.out.print("Enter height = ");
		height = sc.nextDouble();
		System.out.print("Enter depth = ");
		depth = sc.nextDouble();
	}
	public void volume(){
		double vol = width*height*depth;
		System.out.print("Enter volume = "+vol);
	}
}
class BoxDemo{
	public static void main(String args[]){
      Box b = new Box();
      b.setDim();
      b.volume();
	}
}