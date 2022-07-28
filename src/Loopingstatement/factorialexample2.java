package Loopingstatement;

public class factorialexample2 {
	public static void main(String[] args) 
	{
		//int number=4;
		int fact=1;//1 4 12 24 24
		
		int i=5;// 4
		
		//0>=1
		while(i>=1)
		{
			// fact= 4*1=4  3*4=12  2*12=24  1*24=24
			fact=i*fact;		
			i--;//0		
		}
		System.out.println("Factorial of 5 is "+fact);
			
	}

}


