package assignments;
import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
           System.out.println("Printing the AreaOfTriangle ");
           Scanner scanner =new Scanner(System.in);
           
           System.out.println("Enter the value of base ");
           int base=scanner.nextInt();
           
           System.out.println("Enter the valur of height ");
           int height=scanner.nextInt();
            scanner.close();
            
           int area=(base*height)/2;
           System.out.println("Area of Triangle is " +area);           
	}

}
