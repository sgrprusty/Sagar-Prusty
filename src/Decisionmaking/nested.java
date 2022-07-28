package Decisionmaking;

public class nested {
	public static void main(String[] args) {
		
		String UN="Sagar Prusty";
		String PWD="12345";
		
		if ("Sagar Prusty"==UN)
		{
			System.out.println("Correct username");
			if ("12345"==PWD)
			{
				System.out.println("Correct password");
				System.out.println("Login succesfully");
			}
			else 
			{
				System.out.println("incorrect password");
				System.out.println("Login failed");
			}
						
		}
		else 
		{
			System.out.println("Incorrect username");
			System.out.println("Login failed");
		
		}
		
	}

}
