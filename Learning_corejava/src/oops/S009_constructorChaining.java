package oops;

class aa
{
	aa()
	{
		System.out.println("Constructor A calling....");
	}
}


class bb extends aa
{
	bb()
	{
		super();
		System.out.println("Constructor b calling.....");
	}
	
	bb(String name)
	{  
		this();
		System.out.println(name);
	}
}

class cc extends bb
{
	cc()
	{
		
		super("Tops");
		System.out.println("Constructor c calling..........");
	}
}


public class S009_constructorChaining {
	public static void main(String[] args) {
            
		cc a = new cc();
	}
}
