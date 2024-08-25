package assignments;
public class This_Calling 
{
	
	This_Calling(int a)
	{
		System.out.println("Int para const 2");
	}
	This_Calling(double d)
	{
		this(5);
		System.out.println("Double para const 3");
	}
	This_Calling()
	{
		this(7.6);
		System.out.println("No para const 1");
	}
public static void main(String[] args) {
       new This_Calling();        
}	
}
