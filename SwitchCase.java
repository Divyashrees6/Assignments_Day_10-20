package assignments;

import java.util.Scanner;

public class SwitchCase {
public static void main(String[] args) {
	
    Scanner s1= new Scanner(System.in);
    System.out.println("Press 1 for Crome");
    System.out.println("Press 2 for Safari");
    System.out.println("Press 3 for opera");
    int browser_selection=s1.nextInt();
    switch(browser_selection) {
    case 1:
    	System.out.println("Launch Crome browser");
    	break;
    case 2:
    	System.out.println("Launch Safari browser");
    	break;
    case 3:
    	System.out.println("Launch Opera browser");
    	break;
    }         s1.close();

    
	}

}
