package array;

public class ArrayDemo {
	public static void main(String[] args) {
		
		
		int[] a = new int[5];
		
		a[0] = 10;
		a[1] = 20;
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("*******************");
		
		int b[] = {10,20,30,40,50,60};
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		System.out.println("**************");
		
		String sub[] = {"java","php","pythone","Node"};
		
//		for (int i = 0; i < sub.length; i++) {
//			System.out.println(sub[i]);
//		}
		
		for(String s : sub)
		{
			System.out.println(s);
		}
		
		
	}
}
