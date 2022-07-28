package Logical_Program;

public class reverse_string {
	public static void main(String[] args) {
		String s1="Sagar Prusty";
		String s2="";
		
		System.out.println("Original string: " +s1);
		
		//Reverse String
		
		for (int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println("Reversed string: "+s2);
		
		//Remove Space
		
		String s3=s2.replaceAll(" ", "");
		System.out.println(s3);
		
	}

}
