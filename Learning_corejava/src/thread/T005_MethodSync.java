package thread;

class Calc
{
	synchronized public void mul(int n)
	{
		for(int i=1;i<5;i++)
		{
			
			Thread t = Thread.currentThread();
			System.out.println(t.getName()+" : "+(i*n));
		}
	}
}

class Mythread extends Thread
{
	Calc c;
	
	public Mythread(Calc c) {
		this.c = c;
	}
	
	public void run() {
	
		
		c.mul(5);
	}
}

public class T005_MethodSync {
	public static void main(String[] args) {
		
		Calc c = new Calc();
		
		Mythread t1 = new Mythread(c);
		Mythread t2 = new Mythread(c);
		Mythread t3 = new Mythread(c);
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		
		t1.start();
		t2.start();
		t3.start();
		
	
		
	}
}
