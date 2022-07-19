package oops;

class Shape
{
	public void getArea()
	{
		
	}
}

class Circle extends Shape
{
	int r;
	Circle(int r)
	{
		this.r = r;
	}
	@Override
	public void getArea() {
		
		double area = 3.14*r*r;
		System.out.println("Area of circle is : "+area);
	}
}

public class S012_AreaFinder {
	public static void main(String[] args) {
		Circle c = new Circle(50);
		c.getArea();
		
	}
}
