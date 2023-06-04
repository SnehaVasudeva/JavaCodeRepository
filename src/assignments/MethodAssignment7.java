package assignments;

import java.util.Scanner;

public class MethodAssignment7 {

	public void displayGrades(int marks) {

		if (marks >= 91 && marks <= 100) {
			System.out.println("Your Grade is AA");
		} else if (marks >= 81 && marks <= 90) {
			System.out.println("Your Grade is AB");
		} else if (marks >= 71 && marks <= 80) {
			System.out.println("Your Grade is BB");
		} else if (marks >= 61 && marks <= 70) {
			System.out.println("Your Grade is BC");
		} else if (marks >= 51 && marks <= 60) {
			System.out.println("Your Grade is CD");
		} else if (marks >= 41 && marks <= 50) {
			System.out.println("Your Grade is DD");
		} else if (marks >= 0 && marks <= 40) {
			System.out.println("Your Grade is Fail");
		}
		else
			System.out.println("Please enter the right marks " +marks);

	}

	public static void main(String[] args) {
		MethodAssignment7 obj = new MethodAssignment7();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks ");
		int score=sc.nextInt();

		obj.displayGrades(score);

	}

}
