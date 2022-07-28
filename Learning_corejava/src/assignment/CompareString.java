package assignment;

public class CompareString {
	public static void main(String[] args) {
		
		
		String str = "keep";
		String str1 = "peek";
		
		
	
		
		int flag = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=str1.charAt(i))
			{
				flag = 1;
				break;
			}
			
		}
		
		if(flag==0)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
	
		
	}
}
