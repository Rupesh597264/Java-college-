import java.util.Scanner;
class Bankaccount{
	public long acno;
	public long bal;
	Bankaccount(){
		acno = 123456789;
		bal = 540000;
	}
	public void dep(int am){
		bal+=(long)am;
	}
	public void withd(int am){
		bal-=(long)am;
	}
	public void showbal(){
		return bal;
	}
	public void display(){
		Sysytem.out.println("Account number = "+acno+"\n"+"Balance = "+bal);

	}
}
class Account{
	public static void main(String args[]){
		Bankaccount b[] = new Bankaccount[3];
		b[0] = new Bankaccount();
		b[0].display();
		b[0].dep();
		b[0].withd();
		b[0].display();
		b[1] = new Bankaccount();
		b[1].display();
		b[1].dep();
		b[1].withd();
		b[1].display();
		b[2] = new Bankaccount();
		b[2].display();
		b[2].dep();
		b[2].withd();
		b[2].display();
	}
}