package inheritance;

public class v4 extends v3
{
public void sme()
{
	System.out.println("I am a sadhu");
}
public static void main(String[] args) {
	v4 sagar=new v4();
	sagar.seniormanager();
	sagar.manager();
	sagar.teamleader();
	sagar.sme();
}
}
