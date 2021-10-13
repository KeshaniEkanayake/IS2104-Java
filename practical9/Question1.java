abstract class BankAccount{
	protected int accNumber;
	protected String accountType;
	protected String accHoldersName;
	protected String branch="Kandy";
	protected boolean isActiveAccount=true;
	protected double currentBalance;
	
	//constructor
	protected BankAccount(){}
	
	//constructor 	
	protected BankAccount(int accNumber, String accountType, String accHoldersName, double currentBalance){
		this.accNumber=accNumber;
		this.accountType=accountType;
		this.accHoldersName=accHoldersName;
		this.currentBalance=currentBalance;
	}
	
	//concrete methods
	double getBalance(){
		this.currentBalance=currentBalance;
		return currentBalance;
	}
	
	double cashDeposit(double cash){
		currentBalance+=cash;
		return currentBalance;
	}
	
	//abstract methods
	abstract double callInterest();
	public abstract String toString();
}




//savings subclass
class Savings extends BankAccount{
	double interest;
	
	public Savings(){}
	
	public Savings(int accNumber, String accountType, String accHoldersName, double currentBalance, double interest){
		super(accNumber, accountType, accHoldersName, currentBalance);
		this.interest=interest;
	}
	
	//add interest to the current balance
	double callInterest(){
		currentBalance+=currentBalance*interest;
		return currentBalance;
	}
	
	public String toString(){
		return "acc type: "+accountType+"	interest rate: "+interest+"	Current balance: "+currentBalance;
		
	}
}



//current subclass
class Current extends BankAccount{
	double interest;
	
	public Current(){}
	
	public Current(int accNumber, String accountType, String accHoldersName, double currentBalance, double interest){
		super(accNumber, accountType, accHoldersName, currentBalance);
		this.interest=interest;
	}
	
	//add interest to the current balance
	double callInterest(){
		currentBalance+=currentBalance*interest;
		return currentBalance;
	}
	
	public String toString(){
		return "acc type: "+accountType+"	interest rate: "+interest+"	Current balance: "+currentBalance;
		
	}
}






//FD subclass

class FD extends BankAccount{
	double interest;
	
	public FD(){}
	
	public FD(int accNumber, String accountType, String accHoldersName, double currentBalance, double interest){
		super(accNumber, accountType, accHoldersName, currentBalance);
		this.interest=interest;
	}
	
	//add interest to the current balance
	double callInterest(){
		currentBalance+=currentBalance*interest;
		return currentBalance;
	}
	
	public String toString(){
		return "acc type: "+accountType+"	interest rate: "+interest+"	Current balance: "+currentBalance;
		
	}
}




//MAIN CLASS

public class Question1{
	public static void main(String[] args){
	/*create 3 different instances from 3 account types*/
		//savings account
		BankAccount s1=new Savings(001, "S", "Jack", 100000, 0.03);		
		//current account
		BankAccount c1=new Current(201, "C", "Peter", 100000, 0.012);
		//FD account
		BankAccount f1=new FD(301, "FD", "Stefan", 100000, 0.08);
		
		
	/*get the balance of each account type*/
		System.out.println("Current balance: "+s1.getBalance());
		System.out.println("Current balance: "+c1.getBalance());
		System.out.println("Current balance: "+f1.getBalance());
		System.out.println();
		
	
	/*deposit 2000 for each account*/
		System.out.println("Balance after depositing Rs.2000");
		//Display details on savings account
		s1.cashDeposit(2000);
		System.out.println(s1.toString());
		
		//Display details on current account
		c1.cashDeposit(2000);
		System.out.println(c1.toString());

		
		//Display details on FD account
		f1.cashDeposit(2000);
		System.out.println(f1.toString());
		System.out.println();
		
		
		
	/*calculate interest and display details*/
		s1.callInterest();
		c1.callInterest();
		f1.callInterest();
		
		
		System.out.println("Balance after calculating interest");
		System.out.println(s1.toString());
		System.out.println(c1.toString());
		System.out.println(f1.toString());

	}
}
