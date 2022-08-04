package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class C012_wordAccurance {
	public static void main(String[] args) {
		
		
		
		String str = "hello tops hello world world hello java";
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String words[] = str.split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			if(map.get(words[i]) == null)
			{
				map.put(words[i], 1);
			}
			else
			{
				int k = map.get(words[i]);
				k++;
				map.put(words[i], k);
			}
			
		}
		
		
		for(Entry<String, Integer> m : map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
