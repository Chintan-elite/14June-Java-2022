package collection;

import java.util.HashSet;
import java.util.Iterator;

public class C04_HAshSetDemo {
	public static void main(String[] args) {
		
		
		//does not allowed duplication
		//initial size 16
		//load factor : 0.75 
		//store data in random manner
		
		HashSet<String> set = new HashSet<String>();
		set.add("Java");
		set.add("php");
		set.add("pythone");
		set.add("android");
		set.add("Java");
		
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
	}
}
