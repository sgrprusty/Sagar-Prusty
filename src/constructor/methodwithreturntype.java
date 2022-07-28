package constructor;

public class methodwithreturntype 
{
	public int m1()
	{
		return 20;
		
	}
	public static void main(String args[])
	{
		methodwithreturntype ex1=new methodwithreturntype();
		int a=ex1.m1();
		System.out.println(a);
		System.out.println(ex1.m1());
	}
	

}
