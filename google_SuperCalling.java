package assignments;
class opera
{
	opera()
	{
		System.out.println("opera");
	}
	
}
 class mozilla extends opera
 {
	 mozilla(int a, String b)
	 {
		 System.out.println("mozilla");
	 }
 } 

public class google_SuperCalling extends mozilla
{
	
	google_SuperCalling()
		{
		super(8,"Divya");
		System.out.println("google");	
		}
	
public static void main(String[] args)
{
	     
	    new google_SuperCalling();
	    
}
	}


