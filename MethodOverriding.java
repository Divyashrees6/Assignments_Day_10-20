package assignments;
class parent
{
	void class1() 
	{
		System.out.println("Method  1");
	}
	
	void class2()
	{
		System.out.println("Method 2");
	}
	
}
public class MethodOverriding extends parent {

	void class1()
	{
		super.class1();
		System.out.println("child method 1"); 
	}
	
	
	public static void main(String[] args) {
		MethodOverriding d1=new MethodOverriding();
		d1.class1();	
		d1.class2();
	}
}
