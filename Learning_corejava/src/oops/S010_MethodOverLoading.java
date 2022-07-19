package oops;

class calc
{
	public void add(int a, int b)
	{
		int r = a+b;
		System.out.println("m1 : "+r);
	}
	
	public void add(int a, int b, int c)
	{
		int r = a+b+c;
		System.out.println("m2 : "+r);
	}
	
	public void add(double a, int b)
	{
		double r = a+b;
		System.out.println("m3 : "+r);
	}
}

public class S010_MethodOverLoading {
	public static void main(String[] args) {
		
		calc c = new calc();
		c.add(10, 20);
		c.add(10, 20, 30);
		c.add(10.22, 20);
		
	}
}
