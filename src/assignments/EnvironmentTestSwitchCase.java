package assignments;

public class EnvironmentTestSwitchCase {

	public static void main(String[] args) {
		
		String envCheck="uaT  ";
		switch (envCheck.toLowerCase().trim()) {
		case "qa":
			System.out.println("Testing in QA environment");
			break;
		case "stage":
			System.out.println("Testing in Stage environment");
			break;
		case "dev":
			System.out.println("Testing in Dev environment");
			break;
		case "uat":
			System.out.println("Testing in UAT environment");
			break;
		case "prod":
			System.out.println("Testing in Prod environment");
			break;
			

		default:
			System.out.println("Please pass the right environment- " +envCheck);
			break;
		}

	}

}
