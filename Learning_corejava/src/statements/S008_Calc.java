package statements;

import java.util.Scanner;

public class S008_Calc {
	public static void main(String[] args) {

		int choice = 0;
		do {

			Scanner sc = new Scanner(System.in);
			System.out.println("enter choice : ");
			System.out.println("1 : add");
			System.out.println("2 : sub");
			System.out.println("3 : div");
			System.out.println("4 : mul");
			System.out.println("0 : Exit");
			choice = sc.nextInt();
			System.out.println("enter n1 : ");
			int a = sc.nextInt();
			System.out.println("enter n2 : ");
			int b = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("you have choosen exit  option !!!");
				break;
			case 1:
				System.out.println("Addition is : " + (a + b));
				break;
			case 2:
				System.out.println("substraction is : " + (a - b));
				break;
			case 3:
				System.out.println("division is : " + (a / b));
				break;
			case 4:
				System.out.println("multiplcation is : " + (a * b));
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}

		} while (choice != 0);

	}
}
