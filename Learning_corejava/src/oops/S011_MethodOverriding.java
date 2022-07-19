package oops;

class Animal
{
	public void voice()
	{
		System.out.println("This is represnet animal voice");
	}
}

class Dog extends Animal
{
	@Override
	public void voice() {
		System.out.println("Barking...");
	}
}


public class S011_MethodOverriding {
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.voice();
		
	}
}
