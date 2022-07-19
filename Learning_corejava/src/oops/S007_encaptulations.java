package oops;

import java.util.Scanner;

public class S007_encaptulations {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("ENTER ID : ");
		emp.setId(sc.nextInt());
		System.out.println("enter name : ");
		emp.setName(sc.next());
		
		System.out.println(emp.getId()+" "+emp.getName());
		
		
		
	}
}
