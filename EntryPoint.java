package lab5;
import java.util.*;

public class EntryPoint {

public static void main(String[] args) {
	
	Random rnd =  new Random();
	
	int nb1 = rnd.nextInt(9)+1;
	for (int i=0; i<nb1; i++) {
		System.out.println("You have " + (nb1 - 1) + " insertions left");
		
		
		Scanner scan = new Scanner(System.in);
	String First_Name, 	Last_Name;
	int Age;
	double Monthly_Salary;
	
	
	
	System.out.println("Please input the employee's first name: ");
	First_Name =  scan.nextLine();
	
	System.out.println("Please input the employee's last name: ");
	Last_Name =  scan.nextLine();
	
	System.out.println("Please input the employee's age: ");
	Age =  scan.nextInt();
	
	System.out.println("Please input the employee's monthly salary: ");
	Monthly_Salary =  scan.nextDouble();
	
	System.out.println("Employee information:  "+ First_Name + " " + Last_Name + ", "+ Age + ", " + Monthly_Salary);
	}
	


	
	
}
}
