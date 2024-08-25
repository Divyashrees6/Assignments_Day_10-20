package assignments;
import java.util.Scanner;
public class AreaOfCircle {
	public static void main(String[] args) {

		System.out.println("Program to print the area of a circle");
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of radius");
         double radius=s1.nextDouble();
         s1.close();
		double area=Math.PI*radius*radius;
		System.out.println("Area of circle with radius " +radius+ " is:" + area);
		 
	}

}
 
