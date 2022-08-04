package collection;

public class Employee {
	
	int id;
	String name;
	String dept;
	public Employee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+dept);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
	
}
