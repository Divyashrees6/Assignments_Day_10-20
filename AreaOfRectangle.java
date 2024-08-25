package assignments;
import java.util.Scanner;
public class AreaOfRectangle {

	public static void main(String[] args) {
        System.out.println("Program on finding area of a Rectangle:");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the length of Rectangle ");
		int length=scanner.nextInt();
		System.out.println("Enter the Breadth of Rectangle ");
		int breadth=scanner.nextInt();
		scanner.close();
		int area=length*breadth;
		System.out.println("The area of rectangle is " +area);
	}

}
