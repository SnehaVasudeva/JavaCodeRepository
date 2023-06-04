package assignments;

public class StudentNameSwitchCase {

	public static void main(String[] args) {
		String stuName = "Tom";
		int marks = 0;
		switch (stuName) {
		case "Tom":
			marks = 100;
			System.out.println("Tom passed: ");
			break;
		case "Harry":
			marks = 80;
			System.out.println("Harry passed: ");
			break;
		case "Bill":
			marks = 10;
			System.out.println("Bill passed: ");
			break;

		default:
			marks = -1;
			System.out.println("Student name is not found:");
			break;
		}
		System.out.println(marks);
		if(marks>=0)
			System.out.println("Print the marks sheet");
	}

}
