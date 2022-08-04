package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class C012_CharAccurance2 {
	public static void main(String[] args) {
		
		
		
		String str = "hello tops hello world world hello java";
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char ch[] = str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(map.get(ch[i]) == null)
			{
				map.put(ch[i], 1);
			}
			else
			{
				int k = map.get(ch[i]);
				k++;
				map.put(ch[i], k);
			}
			
		}
		
		
		for(Entry<Character, Integer> m : map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
