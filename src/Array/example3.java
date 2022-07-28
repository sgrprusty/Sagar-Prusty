package Array;

public class example3 {
	
	//Combine Array Initialization with Array declaration
	
		public static void main(String[] args) {
		
	//Method1: Using new keyword
		
		int[] i=new int[] {20,40,60,80,100};
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println(i[4]);
		
		System.out.println("**********");
		
		for(int j: i)
		{
			System.out.println(j);
		}
		
		System.out.println("**********");
		
	//Method2: Using literals []
		
		String[] str= {"Sagar","Sanjukta","Riti"};
		
		for(String s:str)
		{
			System.out.println(s);
		}
	}

}
