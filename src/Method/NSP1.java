package Method;

public class NSP1 {

	
	public void swapping(int a, int b)
	
	{
		
		//a=20 -30 b=30 -20
		
		a=a+b; //a=50
		b=a-b; //b= 50-30=20
		a=a-b; //a=50-20=30
		
		System.out.println("after swapping " +a + " Value of b " +b);
		
	}
	
	public static void main(String[] args) {
		
		NSP1 obj= new NSP1();
		
		obj.swapping(20, 30);
		
		
	}
}
