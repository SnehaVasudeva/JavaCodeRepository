package javaLearnings;

public class ConstructorConcept {
String name;
int age;
double salary;


public ConstructorConcept(String name,int age) {
	this.name=name;
	this.age=age;
	
}
public  ConstructorConcept(String name,int age,double salary) {
	this.name=name;
	this.age=age;
	this.salary=salary;
}


	public void getInfo() {
		name="sneha";
		System.out.println("get info");
	}
	
	public void getInfo(int i) {
		System.out.println("get info" + i);
		
	}

	public static void main(String[] args) {
			

ConstructorConcept c2=new ConstructorConcept("Tom",34);
System.out.println(c2.name);
System.out.println(c2.age);
c2.salary=45000;
System.out.println(c2.salary);
ConstructorConcept c3=new ConstructorConcept("Tom",34,5000);
System.out.println(c3.name +c3.age +c3.salary);
//ConstructorConcept c= new ConstructorConcept();	
//System.out.println(c.name +c.age +c.salary);
c2.getInfo();
	}

}
