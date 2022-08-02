package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class C06_TreeSetDemo {
	public static void main(String[] args) {
		
		
		
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("java");
		set.add("php");
		set.add("pythone");
		set.add("android");
		set.add("java");
		
		
		//Iterator<String> itr = set.iterator();
		Iterator<String> itr = set.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
	}
}
