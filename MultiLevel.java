package assignments;

  class one{
	  static void bike()
 {
	 System.out.println("super class no 1 ");
 }
  }
	
 class two extends one
{
	static void car()
{
	System.out.println("super class no 2 ");
}
}
	
public class MultiLevel extends two {
	
	static void Aeroplane()
	{
		System.out.println("Hi i am subclass ");
	}
public static void main(String[] args) {
	bike();
		 car();
		 Aeroplane(); 
		 
		
	}

}
