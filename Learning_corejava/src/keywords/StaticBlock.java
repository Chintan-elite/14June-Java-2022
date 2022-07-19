package keywords;

class Calc {
	static {
		System.out.println("calling Calc class static block....");
	}

	public Calc() {
		System.out.println("calc constructor calling...");
	}

	static class myCalc {
		public static void display() {
			System.out.println("running display...");
		}

		public void run() {
			System.out.println("runing run method");
		}
	}
}


public class StaticBlock {

	static {
		System.out.println("Calling static block");
	}

	public static void main(String[] args) {

		Calc c = new Calc();
		System.out.println("Main method running...");

		{
			System.out.println("calling non-static block");

		}

		// Calc.myCalc.display();

		Calc.myCalc cl = new Calc.myCalc();
		cl.run();
	}
}
