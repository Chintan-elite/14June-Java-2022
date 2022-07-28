package assignment;

import java.util.Scanner;

public class Assignemnt1 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		String name = sc.nextLine();
		int i = sc.nextInt();
		sc.nextLine();
		String email = sc.nextLine();
		
		System.out.println(name+" "+i+" "+email);
		
		
	}
}
