package array;

public class ArrayCopy {
	public static void main(String[] args) {
		
		
		int a[] = {10,20,30,40,50,60};
		int b[] = new int[5];
		
		System.arraycopy(a, 1, b, 2, 3);
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
	}
}
