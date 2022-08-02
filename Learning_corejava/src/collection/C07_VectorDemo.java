package collection;

import java.util.Enumeration;
import java.util.Vector;

public class C07_VectorDemo {
	public static void main(String[] args) {
		
		
		Vector<String> v = new Vector<String>();
		v.addElement("Gujarati");
		v.addElement("Hindi");
		v.addElement("English");
		
		Enumeration<String> en = v.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
		
		
	}
}
