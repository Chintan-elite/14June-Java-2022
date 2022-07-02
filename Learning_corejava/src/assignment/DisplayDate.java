package assignment;

import java.util.Date;

public class DisplayDate {
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getDate());
		System.out.println(date.getTimezoneOffset());
		
	}
}
