package statements;

public class S004_Login {
	public static void main(String[] args) {
		
		String uname="admin1";
		String pass="admin";
		
		if(uname.equals("admin") && pass.equals("admin"))
		{
			System.out.println("Success!!!");
		}
		else
		{
			System.out.println("invalid uname or pass");
		}
		
		
		
	}
}
