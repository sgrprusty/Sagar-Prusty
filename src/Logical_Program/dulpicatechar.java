package Logical_Program;

public class dulpicatechar 
{
	public static void main(String[] args) 
	{
		String str="aahhjjeghaaaknaajj";
		
		char[] c=str.toCharArray();
		
		for (int i=0;i<c.length;i++)
		{
			for (int j=i+1;j<c.length;j++)
			{
				if (c[i]==c[j])
				{
					System.out.println(c[i]);
					break;					
				}
			}
		}
		
		
	}

}
