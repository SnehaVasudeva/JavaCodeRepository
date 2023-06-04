package javaLearnings;

public class Employeest {
	String eName;
	int age;
	float salary;
	boolean fullTime;
	static final String ceoName="Ajit";
	static final String compName="eLabs";
	String dept;
	char gender;
	String reportManager;
	String city;
	

	public static void main(String[] args) {
		
Employeest emp1=new Employeest();
emp1.eName="Harry";
emp1.age=25;
emp1.dept="QA";
emp1.fullTime=true;
emp1.gender='M';
emp1.reportManager="Robert";
emp1.salary=35000;
emp1.city="Pune";
//emp1.compName="IBM";
//emp1.ceoName="Pillai";



System.out.println(emp1.eName +" " +emp1.age +" " +emp1.dept +" " +emp1.fullTime +" " +emp1.gender +" " +emp1.reportManager +" "+" " +emp1.salary +" " +emp1.city);
System.out.println(Employeest.ceoName +" " +Employeest.compName);


Employeest emp2=new Employeest();
emp2.eName="Edward";
emp2.age=35;
emp2.dept="Dev";
emp2.fullTime=true;
emp2.gender='M';
emp2.reportManager="Mona";
emp2.salary=35000;
emp2.city="Delhi";

System.out.println(emp2.eName +" " +emp2.age +" " +emp2.dept +" " +emp2.fullTime +" " +emp2.gender +" " +emp2.reportManager +" " +emp2.salary +" " +emp2.city);
System.out.println(Employeest.ceoName +" " +Employeest.compName);

Employeest emp3=new Employeest();
emp3.eName="Riya";
emp3.age=23;
emp3.dept="HR";
emp3.fullTime=false;
emp3.gender='F';
emp3.reportManager="Shelly";
emp3.salary=25000;
emp3.city="Bangalore";


System.out.println(emp3.eName +" " +emp3.age +" " +emp3.dept +" " +emp3.fullTime +" " +emp3.gender +" " +emp3.reportManager +" " +" " +emp3.salary +" " +emp3.city);
System.out.println(Employeest.ceoName +" " +Employeest.compName);

	}

}
