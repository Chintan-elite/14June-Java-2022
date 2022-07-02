package assignment;

public class Q11 {
	public static void main(String[] args) {
		
		
		int n = 4;
		int temp = n;
		int sum = 0;
		for(int i=1;i<4;i++)
		{
			sum = sum+n;
			System.out.println(n);
			n = (n*10)+temp;
			
		}
		
		System.out.println(sum);
		
		
		
	}
}
