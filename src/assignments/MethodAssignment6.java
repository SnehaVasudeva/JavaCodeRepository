package assignments;

public class MethodAssignment6 {

	public boolean eligibleAgeVote(int age) {
		boolean flag = true;
		System.out.println("Person age is " +age);
		if (age >= 18) {
			System.out.println("Person is eligible to vote");
		}

		else {
			System.out.println("Person is not eligible to vote");
			flag=false;
		}

		return flag;
	}

	public static void main(String[] args) {
	
		MethodAssignment6 obj = new MethodAssignment6();
		int age = 15;
		boolean val = obj.eligibleAgeVote(age);
		System.out.println(val);

	}

}
