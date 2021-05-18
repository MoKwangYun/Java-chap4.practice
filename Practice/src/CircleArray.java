class Circle{
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
}
public class CircleArray {
	public static void main(String[] args) {
		Circle [] c;
		c = new Circle[5];
		
		for(int i = 0; i < c.length; i++) 
			c[i] = new Circle(i); //c[0]에 radius =0:(Circle(0))을, c[1]에 radius =1을 ... 
		for(int i = 0; i < c.length; i++)
			System.out.println((int)(c[i].getArea()) + "");
		
		
	}

}
