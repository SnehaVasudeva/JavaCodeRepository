package assignments;

public class LoanTypeSwitchCase {

	public static void main(String[] args) {
	

		String loanType = "housingloan";
		int salary=34000;
		switch (loanType.toLowerCase()) {
		case "carloan":
			System.out.println("Loan Type: car loan");
			break;
		case "housingloan":
			System.out.println("Loan Type: housing loan");
			if(salary<35000)
				System.out.println("You are not eligible for housing loan");
			break;
		case "personalloan":
			System.out.println("Loan Type: personal loan");
			break;
		case "educationloan":
			System.out.println("Loan Type: educational loan");
			break;

		default:
			System.out.println("Please pass the right loan type");
			break;
		}

	}

}
