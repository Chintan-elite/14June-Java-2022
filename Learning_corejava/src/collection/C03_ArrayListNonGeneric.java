package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class C03_ArrayListNonGeneric {
	public static void main(String[] args) {
		
		
		
		ArrayList al = new ArrayList<>();
		al.add("tops");
		al.add(56);
		al.add(56.23);
		al.add('a');
		
		
//		Iterator itr = al.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
//		for(Object s :al)
//		{
//			System.out.println(s);
//		}
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		{
			System.out.println("enter value : ");
			al1.add(sc.nextInt());
		}
		
		
		for(int i : al1)
		{
			System.out.println(i);
		}
		
		
	}
}
