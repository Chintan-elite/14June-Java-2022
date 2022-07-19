package oops;

class Pen
{
	int price = 20;
	String color = "Red";
	static String company = "cello";
	
	public void toWrite()
	{
		System.out.println(price+" "+color+" "+company);
	}
	
	public static void display()
	{
		System.out.println("running display method...");
	}
}

public class S001_MainClass {
	
	public static void main(String[] args) {
		
		Pen.company="abc";
		
		Pen p1 = new Pen();
		p1.color="black";
		p1.company = "SS";
		p1.toWrite();
		
		Pen p2 = new Pen();
		p2.price=100;
		p2.toWrite();
		
		Pen.display();
		
		
		
	}
}
