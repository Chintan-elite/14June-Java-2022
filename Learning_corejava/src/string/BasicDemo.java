package string;

public class BasicDemo {
	public static void main(String[] args) {
		
		
		//String str = "Hello java";
		//String str1 = new String("Hello tops");
		//String s = str.concat("hello tops");
		//System.out.println(s);
		
		
		String s1 = "Java";
		String s2 = "php";
		String s3 = "Java";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
		
		
		System.out.println("***********************");
		
		String str1 = new String("Java");
		String str2 = new String("php");
		String str3 = new String("Java");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1 == str3);
		
	}
}
