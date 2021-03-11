import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
	
	SchoolClass mySchoolClass = new SchoolClass(); 
	Scanner scan = new Scanner(System.in);
	private String inputValue;
	private String inputStudent;
	private String classInput;
	
	public void welcomeMessage() {
		System.out.println("Welcome to the school X\n");
		//System.out.println("1: Add Student");
		//System.out.println("2: Print out class with current students");
		//System.out.println("\nChoose an option(1/2) or 0 to exit:");
		
		do {
			System.out.println("1: Add Student");
			System.out.println("2: Print out class with current students");
			System.out.println("\nChoose an option(1/2) or 0 to exit:");
			inputValue = scan.nextLine();
			if(inputValue.equals("1")) {
				System.out.println("Which class do you want to add students in?");
				
				/*if (mySchoolClass.classList.size() == 0) {
					System.out.println("\nThere are no any classes yet");
					System.out.println("To add a class please enter the class name:");
					classInput = scan.nextLine();
					mySchoolClass.addClass(classInput);
					
					
				} else {
					System.out.println("");
					mySchoolClass.showClass();
				}
				*/
				
			} else if (inputValue.equals("2")) {
				mySchoolClass.showStudent();
			}
			System.out.println("Do you want to coninue?");
			inputValue = scan.nextLine();
			if (inputValue.equals("9")) {
				continue;
			}
			else {
				inputValue = "0";
			}
		}
		 while(!inputValue.equals("0"));
		 System.out.println("Good Bye :)");
		
	}
}
