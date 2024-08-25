package assignments;
import java.util.Scanner;

public class ArithmaticOP16 {

	public static void main(String[] args) {
		System.out.println("Arithmatic operation program");
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a" );
		int a= s1.nextInt();
		System.out.println("Enter the value of b");
		int b= s1.nextInt();
		s1.close();
		
		int sum= a+b;
		System.out.println("Addition of 2 numbers is" +sum);
		int sub=a-b;
		System.out.println("Subtraction of 2 numbers is" +sub);
		int Multi =a*b;
		System.out.println("Product of 2 numbers is "+Multi);
		int Div=a/b;
		System.out.println("DIvision of 2 numbers is" +Div);
		int Mod=a%b;
		System.out.println("Modulos of 2 numbers is " +Mod);
	}
}
