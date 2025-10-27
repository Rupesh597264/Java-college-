import java.util.Scanner;
class Boxconst{
	public double width;
	public double height;
	public double depth;
	Boxconst(){
		width = 4;
		height = 4;
		depth = 4;
	}
	Boxconst(double width, double height, double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
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
      Boxconst b = new Boxconst();
      b.setDim();
      b.volume();
      Boxconst(4,4,4);
      Boxconst.volume();
	}
}