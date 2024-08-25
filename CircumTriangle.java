package assignments;
import java.util.Scanner;

public class CircumTriangle {
		public static void main(String[] args) {
			
			System.out.println("Program to find the circumference of a Triangle ");
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the value of a");
		int a=s1.nextInt();
		
		System.out.println("Enter the value of b");
		int b=s1.nextInt();
		
		System.out.println("Enter the value of c");
		int c=s1.nextInt();
		s1.close();
		int circum = a+b+c;
		System.out.println("The circumference of a Triangle is " +circum);
	}
	}

