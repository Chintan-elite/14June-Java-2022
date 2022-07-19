package string;

public class StringMethod {
	public static void main(String[] args) {
		
		
		String str = "sun rises in east";
		
		System.out.println("Length : "+str.length());
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.charAt(4));
		System.out.println(str.indexOf('i'));
		System.out.println(str.replace('i', 'X'));
		System.out.println(str.substring(6));
		System.out.println(str.substring(6,11));
		System.out.println(str.trim());
		
		System.out.println("*******************************");
		
		String ar[] = str.split(" ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("Total words : "+ar.length);
		System.out.println("**********************************");
		
		char ch[] = str.toCharArray();
		int count =0;
		for (int i = 0; i < ch.length; i++) {
			
			System.out.println(ch[i]);
			if(ch[i]==' ')
			{
				count++;
			}
		}
		System.out.println("Total space : "+count);
		System.out.println("***********************");
		
		byte b[] = str.getBytes();
		for (int i = 0; i < b.length; i++) {
			
			System.out.println(b[i]);
		}
		
		
	}
}
