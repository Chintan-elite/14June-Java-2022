package impclasses;

public class WrapperDemo {
	public static void main(String[] args) {
		
		
		
		int i = 10;
		
		//boxing
		Integer a = new Integer(i);
		// auto boxing
		Integer a1 = i;
		
		Integer k = new Integer(30);
		//unboxing
		int b = k.intValue();
		//auto unboxing
		int b1 = k;
		
		
		int x = 15863;
		
		Integer y  =x;
		int l =  y.toString().length();
		System.out.println(l);
	}
}
