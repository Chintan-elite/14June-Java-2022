package oprators;

public class S005_turnaryOprator {
	public static void main(String[] args) {
		
		
		//expression ? true:false
		
		int a = 10000;
		int b = 2000;
		int c = 500;
		
		//int r = (a>b) ? a : b;
		
		int r = (a>b) ? (a>c)?a:c : (b>c)?b:c;
		
		
		
		System.out.println(r);
		
	}
}
