package constructorsassignment;

public class Rectangle {
	double length;
	double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public Rectangle() {
		
this(2, 3);
Main1 obj=new Main1();
obj.squareArea();

	}
	
	public double calculateArea(double length,double width) {
		return (length*width);
	}

	
}
