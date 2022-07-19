package assignment;

public class ElementRemoveInArray {
	public static void main(String[] args) {
		
		
		int a[] = {10,20,30,40,50};
		
		for(int i=3;i<a.length-1;i++)
		{
			a[i] = a[i+1];
		}
		
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
	}
}
