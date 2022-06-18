package statements;

public class S002_IfDemo {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;
		//int d = 40;

		if (a > b && a > c) {
			System.out.println("a is greater");
		} else if (b > c && b > a) {
			System.out.println("b is freater");
		} else if (c > a && c > b) {
			System.out.println("c greater");
		}

	}
}
