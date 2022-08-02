package collection;

import java.util.Stack;

public class C08_StackDemo {
	public static void main(String[] args) {
		
		
		
		Stack<String> s = new Stack<String>();
		s.push("Cricket");
		s.push("Hockey");
		s.push("Vollyball");
		s.push("football");
		
		
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		System.out.println("****************");
		
		for(String st :s)
		{
			System.out.println(st);
		}
		
		System.out.println("*************");
		
		System.out.println(s.peek());
        System.out.println("****************");
		
		for(String st :s)
		{
			System.out.println(st);
		}
	}
}
