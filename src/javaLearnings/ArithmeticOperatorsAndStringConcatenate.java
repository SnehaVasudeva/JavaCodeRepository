package javaLearnings;

public class ArithmeticOperatorsAndStringConcatenate {

	public static void main(String[] args) {
		
String x= "Java";
String y= "Selenium";
int num1=23;
int num2=20;
System.out.println(x+y);
System.out.println(num1+num2);

System.out.println(x+y+num1+num2);
System.out.println(num1+num2+x+y);
System.out.println(x+y+(num1+num2));

char var='b';
char var1='a';
System.out.println(var);    //b
System.out.println((byte)var);  //98 (ASCII value of b
System.out.println(var1);    //a
String n1= "Hello";
String n2= "World";

System.out.println('a');     //a
System.out.println('a'+'b');     //195
System.out.println("a+b");  //a+b
System.out.println(var+var1);   //195  (97+98)
System.out.println(var+var1+n1+n2);  //195HelloWorld
System.out.println(n1+n2+var+var1);  //HelloWorldba

int a= 100;
int b=20;
System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a/b);
System.out.println(a%b);



//System.out.println(100/0);
//System.out.println(0/0);
System.out.println(0/100);

System.out.println(100.0/0);
System.out.println(100/0.0);
System.out.println(100.0/0.0);

System.out.println(0.0/0.0);  //NaN  (It is a special case)
System.out.println(0.0/2.0);  //0.0
System.out.println((float)9/0);  //Infinity
System.out.println(0.0/0);

System.out.println(23/2);
System.out.println(23.0/2);
System.out.println(23/2.0);
System.out.println(23.0/2.0);
System.out.println((float)23/2);
char num;
num=55;
System.out.println(num);
char num3=65;
System.out.println(num3);

int s1=100;
int s2=200;
System.out.println("Sum of s1 and s2 is " +(s1+s2));  //Sum of s1 and s2 is 300
System.out.println("Sum of s1 and s2 is " +s1+s2);  //Sum of s1 and s2 is 100200


System.out.println((float)23/2);  //11.5

System.out.println(0/100);   //0 (0 divide by any number is 0)
//System.out.println(100/0);//Any integer Number divide by 0 gives Arithmetic exception
//System.out.println(0/0);     //Arithmetic exception

System.out.println(100.0/0);  //Infinity
System.out.println(100/0.0);  //Infinity
System.out.println(100.0/0.0);  //Infinity

System.out.println(0.0/0.0); //NaN (It is a special case(Not a Number)
System.out.println(0.0/0); //NaN (It is a special case(Not a Number))
System.out.println(0/0.0); //NaN (It is a special case(Not a Number))

System.out.println(0.0/2.0); //0.0
System.out.println((float)9/0); //Infinity

double d1 = 10.10;
double d2 = 20.20;
System.out.println(d1+d2); 


	}

}
