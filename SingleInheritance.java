package assignments;
class flipkart
{
	static void loginwithnumber()
	{
		System.out.println("This is mobile number");
	}
	void registration()
	{
		System.out.println("this is registration");
	}
	
}
public class SingleInheritance extends flipkart

{
    static void loginwithMail()
    {
    	System.out.println("This is mail ID");
    }    
    
	public static void main(String[] args) {
	    loginwithMail();
	    loginwithnumber();
	    SingleInheritance s1= new SingleInheritance();
	    s1.registration();
	}

}
