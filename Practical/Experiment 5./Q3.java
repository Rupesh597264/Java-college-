import java.util.Scanner;
class Box{
	float width;
	float height;
	float depth;
	Box(){
	width = -1;
	height = -1;
	depth = -1;
	}
	Box(float w, float h, float d){
	width = w;
	height = h;
	depth = d;
	}	
	float volume(){
	return width*height*depth;
	}
}
class Boxweight extends Box{
	float weight;
	Boxweight (float w, float h, float d, float m){
	width = w;
	height = h;
	depth = d;
	weight = m;
	}
}
class Q3{
	public static void main(String args[]){
	System.out.println("Rupesh Saini");
	System.out.println("24CSU259");
	Boxweight mybox1 = new Boxweight(10f,20f,15f,34.3f);
	Boxweight mybox2 = new Boxweight(2f,3f,4f,0.076f);
	float vol;
	vol = mybox1.volume();
	System.out.println("Volume of mybox1 = "+vol);
	System.out.println("Weight of mybox1 = "+mybox1.weight);
	System.out.println();
	vol = mybox2.volume();
	System.out.println("Volume of mybox2 = "+vol);
	System.out.println("Weight of mybox2 = "+mybox2.weight);
	System.out.println();
	}
}