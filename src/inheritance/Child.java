package inheritance;

public class Child extends Parent
{
public void Mobile()
{
	System.out.println("IQOO");
}
public static void main(String[] args) {
	Child Son=new Child();
	
	Son.Home();
	Son.Money();
	Son.Vehicle();
	Son.Mobile();
}
}
