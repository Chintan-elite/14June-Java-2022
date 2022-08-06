package thread;

class JoinT extends Thread
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(currentThread().getName()+" : "+i);
		}
	}
}

public class T003_JoinDemo {
	public static void main(String[] args) {
		
		
		JoinT t1 = new JoinT();
		JoinT t2 = new JoinT();
		JoinT t3 = new JoinT();
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		
	
		
	}
}
