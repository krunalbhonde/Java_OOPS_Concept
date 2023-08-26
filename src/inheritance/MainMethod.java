package inheritance;

public class MainMethod  {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.area();
		t.area(2, 3);
		
		Circle c = new Circle();
		c.area();
		c.area(2);
	}
}
