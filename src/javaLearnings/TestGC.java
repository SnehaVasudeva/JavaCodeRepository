package javaLearnings;

public class TestGC {
	
int age;

@Override
public void finalize() {
	System.out.println("Testgc finalize");
}






}
