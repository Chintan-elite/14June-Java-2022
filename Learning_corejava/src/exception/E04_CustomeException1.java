package exception;

import java.util.Scanner;

class Validation
{
	public void agecheck(int age) throws AgeInvalidException
	{
		if(age<18)
		{
			throw new AgeInvalidException();
		}
		else
		{
			System.out.println("Valid age !!!");
		}
	}
}

public class E04_CustomeException1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter yr age : ");
		int age = sc.nextInt();
		
		
		Validation v = new Validation();
		try {
			v.agecheck(age);
		} catch (AgeInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
