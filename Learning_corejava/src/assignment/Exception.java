package assignment;

class AgeInvalidException extends RuntimeException
{
	
}

class NameinvalidException extends RuntimeException{
	
}
class Student
{
	int rollno;
	String name;
	int age;
	String course;
	
	public Student(int rollno, String name, int age, String course) {
		
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	
	public void display()
	{
		if(age>15 && age<21)
		{
			throw new AgeInvalidException();
		}
		else
		{
			
			char ch[] = name.toCharArray();
			String special = "@#$%&*()'+,-./:;<=>?[]^_`{|}";
			for(int i=0;i<ch.length;i++)
			{
				if(Character.isDigit(ch[i]) || special.contains(Character.toString(ch[i])))
				{
					throw new NameinvalidException();
				}
			}
			
			
			System.out.println(rollno+" "+name+" "+age+" "+course);
		}
	}
	
	
	
}

public class Exception {
	public static void main(String[] args) {
		
		Student st = new Student(10, "tops&", 25, "java");
		st.display();
		
	}
}
