package assignment;

class ComplexNumber
{
	int real;
	int image;
	public ComplexNumber(int real, int image) {
		
		this.real = real;
		this.image = image;
	}
	
	public void showNumber()
	{
		System.out.println(real+" + i"+image);
	}
	
	public static ComplexNumber add(ComplexNumber c1 , ComplexNumber c2)
	{
		ComplexNumber c3 = new ComplexNumber(0, 0);
		c3.real = c1.real+c2.real;
		c3.image = c1.image+c2.image;
		
		return c3;
	}
}

public class ComplexAddition {
	public static void main(String[] args) {
		
		
		ComplexNumber c1 = new ComplexNumber(8, 3);
		ComplexNumber c2 = new ComplexNumber(2, 8);
		
		c1.showNumber();
		c2.showNumber();
		
		System.out.println("**********************");
		
		ComplexNumber result =   ComplexNumber.add(c1, c2);
		result.showNumber();
		
	}
}
