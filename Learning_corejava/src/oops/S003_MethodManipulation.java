package oops;

class MethodDemo
{
	public void display()
	{
		System.out.println("running display method...");
	}
	
	public void add(int a, int b)
	{
		int result  =a+b;
		System.out.println("Result is : "+result);
	}
	
	public int square(int a)
	{
		 int square = a*a;
		 return square;
	}
	
	public void arrayAdd(int a[])
	{
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum += a[i];
		}
		
		System.out.println("sum of an array is : "+sum);
	}
	
	
	public int[] revArray(int a[])
	{
		int c[] = new int[a.length];
		int k = 0;
		for(int i=a.length-1;i>=0;i--)
		{
			c[k] = a[i];
			k++;
		}
		return c;
	}
	
	public void num(int...a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
			
	}
}


public class S003_MethodManipulation {
	public static void main(String[] args) {
		
		
		MethodDemo md = new MethodDemo();
		md.display();
		md.add(10, 20);		
		md.add(30, 60);
		int r = md.square(5);
		System.out.println(r);
		
		int k[] = {10,20,30,40,50};
		md.arrayAdd(k);
		
		int m[] = md.revArray(k);
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i]);
		}
		
		md.num(10,20,30,40);
		
	}
}
