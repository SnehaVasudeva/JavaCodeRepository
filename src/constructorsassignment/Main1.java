package constructorsassignment;

public class Main1 {
	double len=10;
	public void squareArea() {
		

		double area= len*len;	
		System.out.println(area);
	}
	

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		System.out.println(rec.length + " " + rec.width);
		
		double area=rec.calculateArea(rec.length,rec.width);
		System.out.println("Area of rectangle is " +area);
		Rectangle rec1 = new Rectangle(4.5, 3.5);
		System.out.println(rec1.length + " " + rec1.width);
		 area=rec1.calculateArea(rec1.length,rec1.width);
		System.out.println("Area of rectangle is " +area);

	}


}
