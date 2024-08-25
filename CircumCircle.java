package assignments;

import java.util.Scanner;

public class CircumCircle {
public static void main(String[] args) {
	
		System.out.println("Program to print circumference of a circle ");
       Scanner s1=new Scanner(System.in);
       
       System.out.println("Enter the value of Radius ");
       int r=s1.nextInt();
       s1.close();
       
       double circum= 2*Math.PI*r;
       System.out.println("The circumference of circle is " +circum);
	}
}
