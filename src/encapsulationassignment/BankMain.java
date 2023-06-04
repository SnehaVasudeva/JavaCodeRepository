package encapsulationassignment;

public class BankMain {

	public static void main(String[] args) {
		BankAccount acc=new BankAccount();
		acc.setAccountNumber("6786787890");
		acc.setBalance(25000);
		acc.setOwner("Saniha");
		
		acc.printStatement(acc.getOwner(),acc.getAccountNumber(),acc.getBalance());
		
		acc.deposit(2000);
		System.out.println("Balance amount is " +acc.getBalance());
		acc.deposit(1000);
		System.out.println("Balance amount is " +acc.getBalance());
		acc.withdraw(5000);
		System.out.println("Balance amount is " +acc.getBalance());
		acc.deposit(300);
		System.out.println("Balance amount is " +acc.getBalance());
		acc.withdraw(2000);
		System.out.println("Balance amount is " +acc.getBalance());
		
		
	}

}
