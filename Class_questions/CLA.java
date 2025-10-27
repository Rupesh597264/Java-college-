class CLA{
	public static void main(String args[]){
	if(args.length==0){
		return ;
	}
	int n = Integer.parseInt(args[0]);
	int fac = 1;
	for(int i=n;i>=1;i--){
			fac=fac*i;
		}
	System.out.print("Factorial = "+fac);
	}
}