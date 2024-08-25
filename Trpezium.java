package assignments;
import java.util.Scanner;
public class Trpezium {

	public static void main(String[] args) {
		System.out.println("Program to calculate the area of Trapezium ");
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the value of base1 ");
		double
		base1 =s1.nextDouble();
		
		System.out.println("Enter the value of base2 ");
		double base2 =s1.nextDouble();
		
		System.out.println("Enter the value of height ");
		double height =s1.nextDouble();
		 s1.close();
		double area = 0.5 * (base1 + base2) * height;
		System.out.println("Area of the Trapezium  " +area);
		
	}

}

