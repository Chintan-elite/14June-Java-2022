package statements;

public class S003_IfDemo {
	public static void main(String[] args) {
		
		int marks = 90;
		
		if(marks>=90)
		{
			System.out.println("Grade A");
		}
		else if(marks<90 && marks>=70)
		{
			System.out.println("Grade B");
		}
		else if(marks<70 && marks>=40)
		{
			System.out.println("grade c");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
		
	}
}
