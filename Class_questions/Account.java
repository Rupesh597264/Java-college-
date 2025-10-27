import java.util.Scanner;
class Bankaccount{
	public long acno;
	public long bal;
	Bankaccount(){
		acno = 123456789;
		bal = 540000;
	}
	public long dep(int am){
		bal+=(long)am;
		return bal;
	}
	public void withd(int am){
		bal-=(long)am;
	}
	public long showbal(){
		return bal;
	}
	public void display(){
		System.out.println("Account number = "+acno+"\n"+"Balance = "+bal);

	}
}
class Account{
	public static void main(String args[]){
		Bankaccount b[] = new Bankaccount[3];
		b[0] = new Bankaccount();
		b[0].display();
		System.out.println(b[0].dep(20));
		b[0].withd(20);
		b[0].display();
		b[1] = new Bankaccount();
		b[1].display();
		b[1].dep(20);
		b[1].withd(20);
		b[1].display();
		b[2] = new Bankaccount();
		b[2].display();
		b[2].dep(20);
		b[2].withd(20);
		b[2].display();
	}
}