package oops;

class A
{
	int a = 10;
	public void display()
	{
		System.out.println("running class A display method...");
	}
}

class B extends A
{
	int a = 80;
	public void run()
	{
		System.out.println("a : "+a);
		System.out.println("a : "+super.a);
		System.out.println("runing run method...");
	}
	
	@Override
	public void display() {
		System.out.println("Running class B display method..");
		super.display();
	}
	
}
class C extends B
{
	
}

public class S008_Inheritance {
	public static void main(String[] args) {
		
		
		A a = new A();
		a.display();
		
		
		B b = new B();
		b.display();
		b.run();
	}
}
