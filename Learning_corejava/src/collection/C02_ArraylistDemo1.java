package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C02_ArraylistDemo1 {
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(20);
		al1.add(50);
		al1.add(60);
		
		
		ArrayList<Integer> al2 = new ArrayList<Integer>(al1);
		al2.add(200);
		al2.add(500);
		al2.add(600);
		al2.addAll(al1);
		
		Iterator<Integer> itr = al2.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		
		
	}
}
