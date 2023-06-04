package assignments;

public class UberAppCarTypeSwitchCase {

	public static void main(String[] args) {
		String carType = "hello";
		switch (carType.toLowerCase().trim()) {
		case "mini":
			System.out.println("Car  type is mini");
			break;
		case "sedan":
			System.out.println("Car  type is sedan");
			break;
		case "suv":
			System.out.println("Car  type is suv");
			break;
		case "premium":
			System.out.println("Car  type is premium");
			break;

		default:
			System.out.println("Please select the right car type");
			break;
		}

	}

}
