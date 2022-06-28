package array;

public class ArrayOpration {
	public static void main(String[] args) {
		
		
		int a[] = {10,2,65,98,63,52,45,23};
		
		//addition
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			sum += a[i];
//			
//		}
//		System.out.println("Total  : "+sum);
//		System.out.println("avrage  : "+sum/a.length);
//	
	
		//max and min
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
			{
				max = a[i];
			}
			
			if(a[i]<min)
			{
				min = a[i];
			}
		}
	
		System.out.println("max is : "+max);
		System.out.println("min is : "+min);
	
	}
}
