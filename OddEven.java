package assignments;
import java.util.Scanner;
public class OddEven {
	
         public static void main(String[] args)
         {
        	 Scanner scanner=new Scanner(System.in);
        	 System.out.println("Enter the number to check:");
        	 int n =scanner.nextInt();
        	 scanner.close();
        	 if (n % 2 == 0)
        	 {
        		 System.out.println(n+  " The number is Even");
        	 }
        		 else 
        		 {
        			System.out.println(n + " The number is Odd");
        	 }
        	  
         }

}
 