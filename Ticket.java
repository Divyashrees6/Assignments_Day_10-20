package assignments;
public class Ticket {

	public static void main(String[] args) {
       
		String gender= "Male";
		int age =70;
		
			if (gender=="Female") {
	            System.out.println("Travelling is free for females."); 
	        } else if (gender=="Male") {
	            if (age <= 12) {
	                System.out.println("Half ticket price for males under 12 years.");
	            } else if (age <= 59) {
	                System.out.println("Full ticket price for males between 12 and 59 years.");
	            } else {
	                System.out.println("Senior citizen ticket price for males aged 60 years and above.");
	            }
	        } else {
	            System.out.println("Invalid gender entered.");
	        }
	    }
	}




