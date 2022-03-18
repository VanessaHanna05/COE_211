package Lab_6;

	import java.util.Scanner;
	public class Employee {
		
		    // Initializing variables
		    private String firstName;
		    private String lastName;
		    private int age;
		    private double salary;

		    public Employee() {
		        // Get user input
		      Scanner scan = new Scanner(System.in);
		      	System.out.println("Please imput the employee's first name: ");
		      	firstName = scan.nextLine();
	System.out.println("Please input the employee's last name: ");
	 			lastName =  scan.nextLine();
	 			
	/*Please input the employee’s last name:
	// Accept user input*/
	 			System.out.println("Please input the employee's age: ");
	 			age =  scan.nextInt();
	 			
	/*Please input the employee’s age:
	// Accept user input*/
	 			System.out.println("Please input the employee's salary: ");
	 			salary =  scan.nextDouble();
	 /*Please input the employee’s salary:
	// Accept user input */

		       

		    }

		    public String formation() {
		     return   "Employee information: "+  firstName + " " + lastName + ", "+ age +", " + salary ;
		    }
	}

