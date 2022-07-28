package Method;

public class nsp2 {
	
	public void call()
	
	{
		
		System.out.println("Mock");
				
	}
	
	public void call2()
	
	{
		System.out.println("Mock2");
		
		call();			
	}
	
	public static void main(String[] args) {
		
		nsp2 obj2 = new nsp2();
		
		obj2.call2();
		
		}

	
}
