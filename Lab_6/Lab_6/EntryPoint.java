package Assignment;
import java.util.Scanner;
public class EntryPoint {
public static void main(String[] args) {

	
	Scanner scan =  new Scanner(System.in);
	System.out.print("hello");
	String Str = scan.nextLine();
	
	System.out.print("Which service would you like to use?\r\n"
			+ "[1]: Basic week visualizer\r\n"
			+ "[2]: Advanced week visualizer\r\n"
			+ "[3]: Basic calculator\r\n"
			+ "[4]: Employee repertoire\r\n"
			+ "");
	int service =  scan.nextInt();
	
	
	switch (service) {
	case 1: 
		BasicWeek S =  new BasicWeek();
	S.printDays();
		break;
	
	
	case 2:
		AdvancedWeek S1 = new AdvancedWeek();
	S1.printDays();	
	break;
	
	case 3:
		Calculator Calc = new Calculator();
	break;
	
	
	
	case 4:
		Employee Emp = new Employee();
	System.out.print(Emp.formation());	;
		break;
}

	
	System.out.println("Would you like to perform another operation? (y/n)");
	Str =  scan.nextLine();
}}
