package oops;

class Sample
{
	public void display()
	{
		System.out.println("running display method...");
	}
}

class Run
{
	static Sample sample = new Sample();
	public void getdata()
	{
		System.out.println("running get data...");
	}
}

public class S005_Aggrigation {
	public static void main(String[] args) {
		
		//Run run = new Run();
		//run.getdata();
		
		Run.sample.display();
		System.out.println("java");
		System.err.println("java");
	}
}
