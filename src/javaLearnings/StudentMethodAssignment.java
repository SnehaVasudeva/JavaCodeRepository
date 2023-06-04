package javaLearnings;

public class StudentMethodAssignment {
	public int studentMarks(String sName) {

		int marks = -1;
		{

			switch (sName.toLowerCase()) {
			case "anna":
				marks = 90;
				break;
			case "mary":
				marks = 80;
				break;
			case "john":
				marks = 20;

				break;

			default:
				System.out.println("Student not found.Please enter the correct student name " + sName);

				break;
			}
			return marks;
		}
	}

	public static void main(String[] args) {
		StudentMethodAssignment obj = new StudentMethodAssignment();
		int m1 = obj.studentMarks("John");
		System.out.println("John scored " +m1);
		if(m1>=0)
		{
			System.out.println("Print the marks sheet");
		}
		int m2 = obj.studentMarks("anna");
		System.out.println("Anna scored " +m2);
		if(m2>=0)
		{
			System.out.println("Print the marks sheet");
		}
		int m3 = obj.studentMarks("mary");
		System.out.println("Mary scored " +m3);
		if(m3>=0)
		{
			System.out.println("Print the marks sheet");
		}
		int m4 = obj.studentMarks("Elsa");
		System.out.println(m4);
		if(m4>=0)
		{
			System.out.println("Print the marks sheet");
		}

	}

}
