package Array;

public class example2 {
	public static void main(String[] args) {
		
		//Step1: Array declaration
		
		String [] str=new String[3];
		
	//Step2: Array initialization
		
		str[0]="sagar";
		str[1]="Ritika";
		str[2]="Risa";
		
	//Step3: Array usage
				//Using for loop
		
		for(int i=0;i<=2;i++)
		{
			System.out.println(str[i]+" ");
		}
		System.out.println("*****");
		
	// Using foreach loop
		
		for (String j: str)
		{
			System.out.print(j+"  ");
		}
		
		
	}

}
