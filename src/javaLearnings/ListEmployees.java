package javaLearnings;

import java.util.ArrayList;

public class ListEmployees {
	
	public ArrayList<String> employeesList(String compName) {
		System.out.println("Company name " +compName);
		ArrayList<String> arr=new ArrayList<String>();
		switch(compName.toLowerCase().trim()) {
		case "ibm":System.out.println("List of IBM employees");
		arr.add("Tom");
		arr.add("Harry");
		arr.add("Megan");
		arr.add("William");
		break;
		
		case "google":System.out.println("List of google employees");
		arr.add("Jim");
		arr.add("Hans");
		arr.add("Kate");
	
		break;
		
		case "cts":System.out.println("List of cts employees");
		arr.add("Rob");
		arr.add("Andy");
		arr.add("Chile");
		arr.add("Will");
		break;
		
		default:
			System.out.println("Company not found " +compName);
			break;
		}
		
		return arr;
	}

	public static void main(String[] args) {
	
		ListEmployees lEmp=new ListEmployees();
		ArrayList<String> ibmlist=lEmp.employeesList("IBM");
		System.out.println(ibmlist);
		ArrayList<String> googlelist=lEmp.employeesList("google");
		System.out.println(googlelist);
		ArrayList<String> tcslist=lEmp.employeesList("tcs");
		System.out.println(tcslist);
	}

}
