import java.util.Scanner;
class Recursion{
    public int a;
    public String b;
    public String m;
    public void fibonacci(){
    	Scanner sc = new Scanner (System.in);
    	System.out.print("Enter an integer = ");
    	a = sc.nextInt();
    	int c = 0;
    	int d = 1;
    	int e;
    	System.out.print(c+" "+d);
    	for(int i=0;i<=a;i++){
    		e = c+d;
    		System.out.print(" "+e);
    		c=d;
    		d=e;
    	}
    }
    public void factorial(){
    	Scanner sc = new Scanner (System.in);
    	System.out.print("\nEnter an integer = ");
    	a = sc.nextInt();
    	int f =1;
    	for(int i=a;i>=1;i--){
    		f*=i;
    	}
    	System.out.print(f);
    }
    public void palindrome(){
    	Scanner sc = new Scanner (System.in);
    	System.out.print("\nEnter a string = ");
    	b = sc.next();
    	boolean k = true;
		for(int i=0; i<b.length()/2; i++){
    	if(b.charAt(i) != b.charAt(b.length()-1-i)){
        k = false;
        break;
    }
	}
		if(k)
    	System.out.println("String is palindrome");
		else
    	System.out.println("String is not palindrome");
    }
    public void reverse(){
    	Scanner sc = new Scanner (System.in);
    	System.out.print("\nEnter a string = ");
    	b = sc.next();
    	String m = "";
		for(int i=b.length()-1; i>=0; i--){
    	m += b.charAt(i);
	}
		System.out.println("Reversed string = " + m);

    }
}
class RecursionProgram{
	public static void main(String arg[]){
		Recursion re = new Recursion();
		re.fibonacci();
		re.factorial();
		Recursion cu = new Recursion();
		cu.palindrome();
		cu.reverse();
	}
}