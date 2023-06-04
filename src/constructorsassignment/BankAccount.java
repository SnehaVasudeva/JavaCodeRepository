package constructorsassignment;

public class BankAccount {
	String accountNumber;
	double balance;
	public BankAccount(String accountNumber,double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	
	public double deposit(double value) {
		balance=balance+value;
		return balance;
	}
	
	public double withdraw(double value) {
		balance=balance-value;
		return balance;
	}
	public static void main(String[] args) {

BankAccount acc=new BankAccount("456789007665",45000);

 System.out.println(" Balance Amount " +acc.accountNumber +" "+acc.balance);
 System.out.println("Deposited " +acc.deposit(4000));

 System.out.println("Deposited " +acc.deposit(2000));
 
 System.out.println("Withdrawal " +acc.withdraw(1000));
 System.out.println("Deposited " +acc.deposit(8000));
 System.out.println("Withdrawal " +acc.withdraw(4000));
 System.out.println("Withdrawal " +acc.withdraw(1000));
 
	}

}
