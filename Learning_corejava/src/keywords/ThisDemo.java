package keywords;

class Sample
{
	int a  =50;
	public void run()
	{
		System.out.println("Runing sample class run method...");
	}
}


class Demo extends Sample
{
	int a;
	Demo(int a)
	{
		this.a = a;
	}
	
	public void run()
	{
		System.out.println("Running run method...");
	}
	
	public void display()
	{
		System.out.println(a);
		System.out.println(super.a);
		this.run();
		super.run();
	}
}

public class ThisDemo {
	public static void main(String[] args) {
		
		Demo d = new Demo(10);
		d.display();
		
		
	}
}
