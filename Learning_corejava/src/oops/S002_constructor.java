package oops;
class Student
{
	int id;
	String name;
	
	Student()
	{
		System.out.println("constructor calling...");
	}
	
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	
	Student(String b)
	{
		name = b;
	}
	
	public void display()
	{
		System.out.println(id+" "+name);
	}
}


public class S002_constructor {
	public static void main(String[] args) {
		
		Student st = new Student(10,"Khinal");
		st.display();
		
		
		Student st1 = new Student(20, "Rahul");
		st1.display();
		
		Student st2 = new Student();
		
		Student st3 = new Student("tops");
		st3.display();
		
	}
}
