package impclasses;

class Demo
{
	int id = 20;
	String name = "tops";
	@Override
	public String toString() {
		
		return id+" "+name;
	}
}
public class ObjectDemo {
	public static void main(String[] args) {
		
		
		Demo d = new Demo();
		System.out.println(d);
		
		
	}
}
