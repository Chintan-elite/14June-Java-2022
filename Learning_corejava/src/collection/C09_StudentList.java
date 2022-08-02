package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class C09_StudentList {

		public static void main(String[] args) {
			
			ArrayList<Student> st = new ArrayList<Student>();
			st.add(new Student(11, "Rahul", "rahul@gmail.com"));
			st.add(new Student(9, "Priti", "priti@gmail.com"));
			st.add(new Student(30, "Khinal", "khinal@gmail.com"));
			
			Collections.sort(st);
			
			Iterator<Student> itr = st.iterator();
			while(itr.hasNext())
			{
				Student s = itr.next();
				s.display();
			}
			
			
			
			
		}
}
