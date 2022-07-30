package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C01_arrayListDemo {
	public static void main(String[] args) {
		
		
		//default-inial size : 10
		//new size = oldsize*(3/2)+1  = 16
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("php");
		al.add("node");
		al.add("selenium");
		al.add(null);
		al.add("java");
		
		//al.add(1,"python");
		//al.set(1, "React");
		//System.out.println(al.get(3));
		//al.remove(3);
		
//		for(String s : al)
//		{
//			System.out.println(s);
//		}
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
