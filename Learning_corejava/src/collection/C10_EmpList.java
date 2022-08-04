package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class C10_EmpList {
	public static void main(String[] args) {
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(1, "Rahul", "java"));
		emp.add(new Employee(5, "Khinal", "php"));
		emp.add(new Employee(4, "Priti", "android"));
		emp.add(new Employee(9, "Mrugank", "ios"));
		
		//Collections.sort(emp, new SortEmpById());
		Collections.sort(emp,new SortEmpByName());
		
		Iterator<Employee> itr = emp.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			Employee e = itr.next();
			e.display();
		}
		
		
		
	}
}
