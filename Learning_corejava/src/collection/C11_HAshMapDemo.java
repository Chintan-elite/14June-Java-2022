package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C11_HAshMapDemo {
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "java");
		map.put(2, "php");
		map.put(3, "android");
		map.put(4, "ios");
		map.put(2, "pythone");
		
		
		//System.out.println(map.get(3));
		//System.out.println(map);
		
//		Set s = map.entrySet();
//		Iterator itr = s.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		
		for(Entry<Integer, String> m : map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
}
