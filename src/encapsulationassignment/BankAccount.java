package encapsulationassignment;

public class BankAccount {
	private String accountNumber;
	private double balance;
	private String owner;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public double deposit(double value) {
		balance=balance+value;
		return balance;
	}
	
	public double withdraw(double value) {
		balance=balance-value;
		return balance;
	}
	
	public void printStatement(String o,String accno,double bal)
	{
		System.out.println("Account owner: " +o +" "+"Account number: " +" " +accno +" " +"Balance " +bal);
	}

}
