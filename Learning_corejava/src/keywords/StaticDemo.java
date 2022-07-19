package keywords;

class Abs
{
	static int count=0;
	Abs()
	{
		count++;
		System.out.println("Object created : "+count);
		System.out.println("cunstructor calling...");
	}
}

public class StaticDemo {
	public static void main(String[] args) {
		
		Abs a1 = new Abs();
		Abs a2 = new Abs();
		Abs a3 = new Abs();
		
		
	}
}
